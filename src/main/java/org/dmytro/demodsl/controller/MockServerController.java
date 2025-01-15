package org.dmytro.demodsl.controller;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.dmytro.demodsl.component.MockEndpointRequest;
import org.dmytro.demodsl.dto.EndpointDefinitionRequest;
import org.dmytro.demodsl.entity.MockEndpoint;
import org.dmytro.demodsl.service.MockServerService;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mock")
@RequiredArgsConstructor
@Validated
@CrossOrigin
public class MockServerController {
    private final MockServerService service;
    private final RestTemplate restTemplate;
    private static final String WIREMOCK_SERVER_URL = "http://localhost:8081";

    @PostMapping("/define-endpoint")
    public ResponseEntity<String> defineEndpoint(@Valid @RequestBody MockEndpointRequest mockEndpointRequest) {
        service.defineEndpoint(mockEndpointRequest);
        return ResponseEntity.ok("Endpoint defined");
    }

//    @GetMapping("/endpoints")
//    public List<MockEndpoint> getAllEndpoints() {
//        return service.getAllEndpoints();
//    }

//    @PostMapping("/endpoints")
//    public ResponseEntity<String> defineEndpoint(@RequestBody EndpointDefinitionRequest request) {
//        service.defineEndpoint()
//                .method(request.getMethod())
//                .path(request.getPath())
//                .response(request.getResponse())
//                .status(request.getStatusCode())
//                .register();
//        return ResponseEntity.ok("Endpoint defined via DSL");
//    }

//    @RequestMapping("**")
//    public ResponseEntity<String> handleRequest(HttpServletRequest request) {
//
//
//
//        String wireMockUrl = WIREMOCK_SERVER_URL + request.getRequestURI();
//
//        HttpMethod method  = HttpMethod.valueOf(request.getMethod());
//
//
//
//        System.out.println(wireMockUrl);
//
//        ResponseEntity<String> wireMockResponse = restTemplate.exchange(
//                wireMockUrl,
//                method,
//                new HttpEntity<>(requestBody),
//                String.class);
//
//        // Додаємо додаткові заголовки до відповіді перед тим, як повернути її клієнту
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Content-Type", "application/json");  // Встановлюємо тип контенту на JSON
//
//        // Повертаємо відповідь клієнту, копіюючи контент і заголовки з WireMock
//        return ResponseEntity
//                .status(wireMockResponse.getStatusCode())
//                .headers(headers)
//                .body(wireMockResponse.getBody());
//
//
//        String path = request.getRequestURI();
//        String method = request.getMethod();
//
//        MockEndpoint endpoint = service.getResponse(path, method);
//
//        return ResponseEntity
//                .status(endpoint.getStatusCode())
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(endpoint.getResponse());
//    }


    @RequestMapping("**")
    public Mono<ResponseEntity<byte[]>> handleRequest(HttpServletRequest request) {

        // Формуємо URL для WireMock
        String wireMockUrl = WIREMOCK_SERVER_URL + request.getRequestURI().replace("/mock", "");

        // Отримуємо HTTP-метод
        HttpMethod method = HttpMethod.valueOf(request.getMethod());

        // Копіюємо заголовки з вхідного запиту
        HttpHeaders headers = new HttpHeaders();
        Collections.list(request.getHeaderNames()).forEach(headerName -> {
            if (!headerName.equalsIgnoreCase("Content-Length") &&
                    !headerName.equalsIgnoreCase("Content-Type") &&
                    !headerName.equalsIgnoreCase("Host")) {
                headers.add(headerName, request.getHeader(headerName));
            }
        });

        headers.add("Content-Type", "application/json");
        System.out.println("Request headers: " + headers);

        WebClient webClient = WebClient.builder().build();

        // Читаємо тіло запиту асинхронно
        return Mono.fromCallable(() -> request.getInputStream().readAllBytes())
                .defaultIfEmpty(new byte[0])
                .flatMap(requestBody -> {
                    System.out.println("Request body: " + (requestBody.length == 0
                            ? "Empty body"
                            : new String(requestBody, StandardCharsets.UTF_8)));

                    System.out.println("Sending " + method + " request to WireMock: " + wireMockUrl);
                    // Відправляємо запит до WireMock через WebClient
                    return webClient
                            .method(method)
                            .uri(wireMockUrl)
                            .headers(httpHeaders -> httpHeaders.addAll(headers))
                            .bodyValue(requestBody)
                            .retrieve()
                            .toEntity(byte[].class);
                })
                .map(wireMockResponse -> {

                    System.out.println("Response status: " + wireMockResponse.getStatusCode());

                    HttpHeaders responseHeaders = new HttpHeaders();

                    wireMockResponse.getHeaders().forEach((key, value) -> {
                        if (!key.equalsIgnoreCase("Transfer-Encoding")) {
                            responseHeaders.put(key, value);
                        }
                    });

                    System.out.println("Response body: " + new String(wireMockResponse.getBody()));

                    // Повертаємо відповідь клієнту
                    return ResponseEntity
                            .status(wireMockResponse.getStatusCode())
                            .headers(responseHeaders)
                            .body(wireMockResponse.getBody());
                });
    }



//    @RequestMapping("**")
//    public ResponseEntity<byte[]> handleRequest(HttpServletRequest request) throws IOException {
//        // Формуємо URL для WireMock
//        String wireMockUrl = WIREMOCK_SERVER_URL + request.getRequestURI().replace("/mock", "");
//
//        // Отримуємо HTTP-метод
//        HttpMethod method = HttpMethod.valueOf(request.getMethod());
//
//        // Читаємо тіло запиту
////        byte[] requestBody = request.getInputStream().readAllBytes();
//
////        System.out.println("Request body: " + (requestBody == null || requestBody.length == 0
////                ? "Empty body"
////                : new String(requestBody, StandardCharsets.UTF_8)));
//
//        // Копіюємо заголовки з вхідного запиту
//        HttpHeaders headers = new HttpHeaders();
//        Collections.list(request.getHeaderNames()).forEach(headerName -> {
//            if (!headerName.equalsIgnoreCase("Content-Length") && !headerName.equalsIgnoreCase("Content-Type") && !headerName.equalsIgnoreCase("Host")) {
//                headers.add(headerName, request.getHeader(headerName));
//            }
//        });
//
//        headers.add("Content-Type", "application/json");
//
//        System.out.println("Request headers: " + headers);
//
//        // Формуємо HTTP-запит для проміжного сервера
//        HttpEntity<ServletInputStream> httpEntity = new HttpEntity<>(request.getInputStream(), headers);
//
//        // Відправляємо запит до WireMock
//        ResponseEntity<byte[]> wireMockResponse = restTemplate.exchange(
//                wireMockUrl,
//                method,
//                httpEntity,
//                byte[].class
//        );
//
//        System.out.println(new String(wireMockResponse.getBody()));
//
//        // Копіюємо заголовки з відповіді WireMock
//        HttpHeaders responseHeaders = new HttpHeaders();
//        wireMockResponse.getHeaders().forEach((key, value) -> {
//            if (!key.equalsIgnoreCase("Transfer-Encoding")) { // Виключаємо проблемні заголовки
//                responseHeaders.put(key, value);
//            }
//        });
//
//        // Повертаємо відповідь клієнту
//        return ResponseEntity
//                .status(wireMockResponse.getStatusCode())
//                .headers(responseHeaders)
//                .body(wireMockResponse.getBody());
//    }


//    @RequestMapping("**")
//    public ResponseEntity<String> handleRequest(HttpServletRequest request) throws IOException {
//        // Формуємо URL для WireMock
//        String wireMockUrl = WIREMOCK_SERVER_URL + request.getRequestURI().replace("/mock", "");
//
//        // Отримуємо HTTP-метод
//        HttpMethod method = HttpMethod.valueOf(request.getMethod());
//
//        System.out.println("Sending " + method + " request to WireMock: " + wireMockUrl);
//
//        // Читаємо тіло запиту
//        String requestBody = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
//
//        System.out.println("Request body: " + requestBody);
//
//
//        // Копіюємо заголовки з вхідного запиту
//        HttpHeaders headers = new HttpHeaders();
//        Collections.list(request.getHeaderNames())
//                .forEach(headerName -> {
//                    if (!headerName.equalsIgnoreCase("Content-Length") &&
//                            !headerName.equalsIgnoreCase("Host")) {
//                        headers.add(headerName, request.getHeader(headerName));
//                    }
//                });
//
//        System.out.println("Request headers: " + headers);
//
//        // Формуємо HTTP-запит для проміжного сервера
//        HttpEntity<String> httpEntity = new HttpEntity<>(requestBody, headers);
//
//        System.out.println("Request entity: " + httpEntity);
//        // Відправляємо запит до проміжного сервера
//        ResponseEntity<String> wireMockResponse = restTemplate.exchange(
//                wireMockUrl,
//                method,
//                httpEntity,
//                String.class
//        );
//
//        System.out.println("Response from WireMock: " + wireMockResponse);
//
//        // Копіюємо заголовки з відповіді WireMock
////        HttpHeaders responseHeaders = new HttpHeaders();
////        responseHeaders.putAll(wireMockResponse.getHeaders());
//
////        HttpHeaders responseHeaders = new HttpHeaders();
////        wireMockResponse.getHeaders().forEach((key, value) -> {
////            if (!key.equalsIgnoreCase("Transfer-Encoding")) { // Виключаємо проблемні заголовки
////                responseHeaders.put(key, value);
////            }
////        });
//
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.add("Content-Type", "application/json");
//        responseHeaders.add("Content-Encoding", "gzip");
//        responseHeaders.add("Matched-Stub-Id", "68814c2c-6dda-4bf8-b0b6-c8ffe733919e");
//        responseHeaders.add("Transfer-Encoding", "chunked");
////        responseHeaders.add("Connection", "close");
//
//        System.out.println("Response headers: " + responseHeaders);
//        // Повертаємо відповідь клієнту
//        ResponseEntity<String> body = ResponseEntity
//                .status(wireMockResponse.getStatusCode())
//                .headers(responseHeaders)
//                .body(wireMockResponse.getBody());
//
//        System.out.println("Response to client: " + body);
//        return body;
//    }

//    @GetMapping("/proxy")
//    public ResponseEntity<String> proxyRequest(@RequestParam(required = false) String param) {
//        // Приклад створення запиту до WireMock
//        String wireMockUrl = WIREMOCK_SERVER_URL + "/your-endpoint";
//        System.out.println(wireMockUrl);
//
//        // Відправляємо запит до WireMock сервера
//        ResponseEntity<String> forEntity = restTemplate.getForEntity(wireMockUrl, String.class);
////        String wireMockResponse = restTemplate.getForObject(wireMockUrl, String.class);
//
//        // Повертаємо відповідь користувачу
//        return forEntity;
//    }
//
//    @PostMapping("/proxy")
//    public ResponseEntity<String> proxyPostRequest(@RequestBody String requestBody) {
//        // Формуємо URL для запиту до WireMock
//        String wireMockUrl = WIREMOCK_SERVER_URL + "/your-endpoint";
//        System.out.println("request body " + requestBody);
//        System.out.println("Sending POST request to WireMock: " + wireMockUrl);
//
//        // Відправляємо POST запит до WireMock сервера з переданим тілом запиту
//        ResponseEntity<String> wireMockResponse = restTemplate.exchange(
//                wireMockUrl,
//                HttpMethod.POST,
//                new HttpEntity<>(requestBody),
//                String.class);
//
//        // Додаємо додаткові заголовки до відповіді перед тим, як повернути її клієнту
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Content-Type", "application/json");  // Встановлюємо тип контенту на JSON
//
//        // Повертаємо відповідь клієнту, копіюючи контент і заголовки з WireMock
//        return ResponseEntity
//                .status(wireMockResponse.getStatusCode())
//                .headers(headers)
//                .body(wireMockResponse.getBody());
//    }

}
