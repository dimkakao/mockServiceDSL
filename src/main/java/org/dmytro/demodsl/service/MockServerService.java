package org.dmytro.demodsl.service;

import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.dmytro.demodsl.component.MockEndpointRequest;
import org.dmytro.demodsl.entity.MockEndpoint;
import org.dmytro.demodsl.repository.MockEndpointRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Service
@RequiredArgsConstructor
public class MockServerService {

    private final MockEndpointRepository repository;
    private final MockEndpointRequestResolver mockEndpointRequestResolver;

    {
        WireMock.configureFor("localhost", 8081);

        WireMock.stubFor(WireMock.get(urlEqualTo("/your-endpoint"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("Mock response from WireMock")));

        WireMock.stubFor(WireMock.post(urlEqualTo("/your-endpoint"))
                .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("{\"mock\": \"response\"}")
                        .withHeader("Content-Type", "application/json"))
        );

        WireMock.stubFor(WireMock.post(urlEqualTo("/your-endpoint"))
                .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("{\"mock\": \"response йоу\"}")
                        .withHeader("Content-Type", "application/json"))
        );

        WireMock.stubFor(
                WireMock.post(
                                urlEqualTo("/your-endpoint")
                        )
                        .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withBody("{\"mock\": \"response йоу\"}")
                                .withHeader("Content-Type", "application/json"))
        );


    }

    public List<MockEndpoint> getAllEndpoints() {
        return repository.findAll();
    }

    public MockEndpoint getResponse(String path, String method) {
        System.out.println(path);
        System.out.println(method);
        return repository.findByPathAndMethod(path, method)
                .orElse(new MockEndpoint(null, method, path, "{\"error\":\"Not Found\"}", 404));
    }

    public void addEndpoint(MockEndpoint endpoint) {
        repository.save(endpoint);
    }

    public void defineEndpoint(@Valid MockEndpointRequest mockEndpointRequest) {

        mockEndpointRequestResolver.stubMockEndpointRequest(mockEndpointRequest);
//        WireMock.stubFor(WireMock.post(urlEqualTo("/your-endpoint"))
//                .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withBody("{\"mock\": \"response йоу\"}")
//                        .withHeader("Content-Type", "application/json"))
//        );
    }

    public EndpointBuilder defineEndpoint() {
        return new EndpointBuilder(this);
    }
}
