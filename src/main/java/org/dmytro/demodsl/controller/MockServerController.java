package org.dmytro.demodsl.controller;

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

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mock")
@RequiredArgsConstructor
@Validated
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

    @PostMapping("/endpoints")
    public ResponseEntity<String> defineEndpoint(@RequestBody EndpointDefinitionRequest request) {
        service.defineEndpoint()
                .method(request.getMethod())
                .path(request.getPath())
                .response(request.getResponse())
                .status(request.getStatusCode())
                .register();
        return ResponseEntity.ok("Endpoint defined via DSL");
    }

    @RequestMapping("**")
    public ResponseEntity<String> handleRequest(HttpServletRequest request) {
        String path = request.getRequestURI();
        String method = request.getMethod();

        MockEndpoint endpoint = service.getResponse(path, method);

        return ResponseEntity
                .status(endpoint.getStatusCode())
                .contentType(MediaType.APPLICATION_JSON)
                .body(endpoint.getResponse());
    }

    @GetMapping("/proxy")
    public ResponseEntity<String> proxyRequest(@RequestParam(required = false) String param) {
        // Приклад створення запиту до WireMock
        String wireMockUrl = WIREMOCK_SERVER_URL + "/your-endpoint";
        System.out.println(wireMockUrl);

        // Відправляємо запит до WireMock сервера
        ResponseEntity<String> forEntity = restTemplate.getForEntity(wireMockUrl, String.class);
//        String wireMockResponse = restTemplate.getForObject(wireMockUrl, String.class);

        // Повертаємо відповідь користувачу
        return forEntity;
    }

    @PostMapping("/proxy")
    public ResponseEntity<String> proxyPostRequest(@RequestBody String requestBody) {
        // Формуємо URL для запиту до WireMock
        String wireMockUrl = WIREMOCK_SERVER_URL + "/your-endpoint";
        System.out.println("request body " + requestBody);
        System.out.println("Sending POST request to WireMock: " + wireMockUrl);

        // Відправляємо POST запит до WireMock сервера з переданим тілом запиту
        ResponseEntity<String> wireMockResponse = restTemplate.exchange(
                wireMockUrl,
                HttpMethod.POST,
                new HttpEntity<>(requestBody),
                String.class);

        // Додаємо додаткові заголовки до відповіді перед тим, як повернути її клієнту
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");  // Встановлюємо тип контенту на JSON

        // Повертаємо відповідь клієнту, копіюючи контент і заголовки з WireMock
        return ResponseEntity
                .status(wireMockResponse.getStatusCode())
                .headers(headers)
                .body(wireMockResponse.getBody());
    }

    public Map<String, Object> get(List<Object> objects) {
        return objects.stream()
                .collect(Collectors.toMap(o -> "", Function.identity()));
    }

}
