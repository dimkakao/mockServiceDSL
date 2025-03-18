package org.dmytro.demodsl.service_visitors;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.entity.MockEndpoint;
import org.dmytro.demodsl.parser.DmytroMockDSLLexer;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.parser.custom_listener.SyntaxErrorListener;
import org.dmytro.demodsl.repository.MockEndpointRepository;
import org.dmytro.demodsl.service_visitors.MockEndpointRequestResolver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MockServerService {

    private final MockEndpointRequestResolver mockEndpointRequestResolver;
    private final MockEndpointRequestDefinitionProcessingService mockEndpointRequestDefinitionProcessingService;
    private final SyntaxErrorListener syntaxErrorListener;

//        WireMock.stubFor(WireMock.get(urlEqualTo("/your-endpoint"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withBody("Mock response from WireMock")));
//
//        WireMock.stubFor(WireMock.post(urlEqualTo("/your-endpoint"))
//                .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withBody("{\"mock\": \"response\"}")
//                        .withHeader("Content-Type", "application/json"))
//        );
//
//        WireMock.stubFor(WireMock.post(urlEqualTo("/your-endpoint"))
//                .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withBody("{\"mock\": \"response йоу\"}")
//                        .withHeader("Content-Type", "application/json"))
//        );
//
//        WireMock.stubFor(
//                WireMock.post(
//                                urlEqualTo("/your-endpoint")
//                        )
//                        .withRequestBody(equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}"))
//                        .willReturn(aResponse()
//                                .withStatus(200)
//                                .withBody("{\"mock\": \"response йоу\"}")
//                                .withHeader("Content-Type", "application/json"))
//        );

//    public MockEndpoint getResponse(String path, String method) {
//        System.out.println(path);
//        System.out.println(method);
//        return repository.findByPathAndMethod(path, method)
//                .orElse(new MockEndpoint(null, method, path, "{\"error\":\"Not Found\"}", 404));
//    }

    public void defineEndpoint(@NotBlank String query) {
        log.info("Start defining endpoint");

        DmytroMockDSLLexer lexer = new DmytroMockDSLLexer(CharStreams.fromString(query));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new SyntaxErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DmytroMockDSLParser parser = new DmytroMockDSLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(syntaxErrorListener);

        DmytroMockDSLParser.EndpointDefinitionRequestContext endpointDefinitionRequestContext = parser.endpointDefinitionRequest();

        DmytroMockDSLParser.RequestDefinitionContext requestDefinitionContext = endpointDefinitionRequestContext.requestDefinition();

        MockEndpointRequestDefinition mockEndpointRequestDefinition
                = mockEndpointRequestDefinitionProcessingService.visitMockEndpointRequestDefinition(requestDefinitionContext);

        System.out.println(mockEndpointRequestDefinition);

        mockEndpointRequestResolver.stubMockEndpointRequest(mockEndpointRequestDefinition);
    }

//    public void defineEndpoint(@Valid MockEndpointRequestDefinition mockEndpointRequestDefinition) {
//        log.info("Start defining endpoint");
//        mockEndpointRequestResolver.stubMockEndpointRequest(mockEndpointRequestDefinition);
//    }
}
