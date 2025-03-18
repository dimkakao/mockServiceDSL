package org.dmytro.demodsl;

import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.dmytro.demodsl.service_visitors.MockServerService;
import org.dmytro.demodsl.util.StringUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@ActiveProfiles("test")
@SpringBootTest
class DmytroMockDSLLexerTest {

    @Autowired
    private MockServerService service;

    @Value("${dmytroDsl.wiremock.test.url}")
    private String testWiremockUrl;

    @Value("${dmytroDsl.wiremock.test.port}")
    private Integer testWiremockPort;

    @Value("${dmytroDsl.wiremock.test.host}")
    private String host;

    private WebClient webClient;

    @Autowired
    public void setWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(testWiremockUrl).build();
    }

    @PostConstruct
    public void configureWireMock() {
        log.info("Configuring WireMock for TEST profile");
        log.info("WireMock port: {}", testWiremockPort);
        WireMock.configureFor(host, testWiremockPort);
    }

    @AfterEach
    void tearDown() {
        WireMock.reset();
    }

    @Test
    void shouldParseDSLAndHandleRequest() {
        String query = StringUtils.readResourceFile("testCaseDSLQuery_Post_Path_AllRequestProperties.txt");

        String path = "/api/users";
        service.defineEndpoint(query);

        Map<String, String> queryParamsMap = Map.of(
                "USER_XXX", "xxx",
                "USER_ID", "validValue"
        );

        String queryParams = StringUtils.mapToQueryString(queryParamsMap);

        Map<String, String> formParamsMap = Map.of(
                "FormMaParaMa", "7777"
        );

        String formParams = StringUtils.mapToQueryString(formParamsMap);

        WebClient.ResponseSpec response = webClient.post()
                .uri(uriBuilder -> uriBuilder
                        .path(path)
                        .query(queryParams)
                        .build()
                )
                .header(HttpHeaders.AUTHORIZATION, "Bearer 456")
                .cookie("USER_COOKIE", "SomeValue")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromValue(formParams))
                .retrieve();

        assertNotNull(response);

        ResponseEntity<String> block = response.toEntity(String.class).block();
        assertNotNull(block);

        HttpStatusCode statusCode = block.getStatusCode();

        log.info("Response: {}", response);
        log.info("Response not null");
        assertEquals(HttpStatus.OK, statusCode);
        log.info("Test passed with status code: {}", statusCode);

        String responseBody = block.getBody();
        assertNotNull(responseBody);
        log.info("Test not null passed with response body: {}", responseBody);

        assertTrue(responseBody.contains("I am a mock response"));
        log.info("Test passed with response body: {}", responseBody);
    }

    @Test
    void shouldParseDSLAndHandleRequest2() {
        String query = StringUtils.readResourceFile("testCaseDSLQuery_Put_PathAndQuery_AllRequestProperties.txt");

        String path = "/api/users/put";
        service.defineEndpoint(query);

        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("name", "John");
        queryParams.add("surname", "Doe");

        MultiValueMap<String, String> formParams = new LinkedMultiValueMap<>();
        formParams.add("FormMaParaMa", "7777");
        formParams.add("form", "form");

        WebClient.ResponseSpec response = webClient.put()
                .uri(uriBuilder -> uriBuilder
                        .path(path)
                        .queryParams(queryParams)
                        .build()
                )
                .header(HttpHeaders.AUTHORIZATION, "Bearer 123")
                .cookie("USER_COOKIE", "AbrAcadabra")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromValue(formParams))
                .retrieve();

        assertNotNull(response);

        Mono<ResponseEntity<String>> entity = response.toEntity(String.class);

        ResponseEntity<String> block = entity.block();

        assertNotNull(block);

        HttpStatusCode statusCode = block.getStatusCode();

        log.info("Response: {}", response);
        log.info("Response not null");
        assertEquals(HttpStatus.OK, statusCode);
        log.info("Test passed with status code: {}", statusCode);

        String responseBody = block.getBody();
        assertNotNull(responseBody);
        log.info("Test not null passed with response body: {}", responseBody);

        assertTrue(responseBody.contains("I am a mock response"));
        log.info("Test passed with response body: {}", responseBody);
    }
}
