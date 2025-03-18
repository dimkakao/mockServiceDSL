package org.dmytro.demodsl.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.service_visitors.MockServerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Collections;

@RestController
@RequestMapping("/mock")
@RequiredArgsConstructor
@Validated
@CrossOrigin
@Slf4j
public class MockServerController {
    private static final String WIREMOCK_SERVER_URL = "http://localhost:8081";
    private final MockServerService service;

//    @PostMapping("/define-endpoint")
//    public ResponseEntity<String> defineEndpoint(@Valid @RequestBody MockEndpointRequestDefinition mockEndpointRequestDefinition) {
//        service.defineEndpoint(mockEndpointRequestDefinition);
//        return ResponseEntity.ok("Endpoint defined");
//    }

    @RequestMapping("**")
    public Mono<ResponseEntity<byte[]>> handleRequest(HttpServletRequest request) {

        String wireMockUrl = WIREMOCK_SERVER_URL + request.getRequestURI().replace("/mock", "");
        HttpMethod method = HttpMethod.valueOf(request.getMethod());
        HttpHeaders headers = new HttpHeaders();

        Collections.list(request.getHeaderNames())
                .forEach(headerName -> headers.add(headerName, request.getHeader(headerName)));

        log.info("Request headers: " + headers);

        WebClient webClient = WebClient.builder().build();

        return Mono.fromCallable(() -> request.getInputStream().readAllBytes())
                .defaultIfEmpty(new byte[0])
                .flatMap(requestBody -> {
                    log.info("Request body: " + (requestBody.length == 0
                            ? "Empty body"
                            : new String(requestBody, StandardCharsets.UTF_8)));

                    log.info("Sending " + method + " request to WireMock: " + wireMockUrl);
                    return webClient
                            .method(method)
                            .uri(wireMockUrl)
                            .headers(httpHeaders -> httpHeaders.addAll(headers))
                            .bodyValue(requestBody)
                            .retrieve()
                            .toEntity(byte[].class);
                })
                .map(wireMockResponse -> {

                    byte[] body = wireMockResponse.getBody();
                    HttpHeaders responseHeaders = new HttpHeaders(wireMockResponse.getHeaders());

                    String responseBody = new String(body);
                    log.info("Response status: " + wireMockResponse.getStatusCode());
                    log.info("Response body: " + responseBody);

                    return ResponseEntity
                            .status(wireMockResponse.getStatusCode())
                            .headers(responseHeaders)
                            .body(body);
                });
    }
}
