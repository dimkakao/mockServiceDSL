package org.dmytro.demodsl.service_visitors;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class MockEndpointRequestDefinitionProcessingService {

    private static final RequestPropertyProcessorService requestPropertyProcessorService = new RequestPropertyProcessorService();
    private static final RequestBodyRuleProcessorService requestBodyRuleProcessorService = new RequestBodyRuleProcessorService();

    public MockEndpointRequestDefinition visitMockEndpointRequestDefinition(DmytroMockDSLParser.RequestDefinitionContext requestDefinitionContext) {

        MockEndpointRequestDefinition mockEndpointRequestDefinition = new MockEndpointRequestDefinition();

        String httpMethodText = requestDefinitionContext.setHttpMethodCommand().httpMethodTypes().getText().toUpperCase();
        log.info("httpMethodText: " + httpMethodText);
        HttpRequestMethod method = HttpRequestMethod.valueOf(httpMethodText);
        mockEndpointRequestDefinition.setMethod(method);

        String urlMatchTypeString = requestDefinitionContext.setUrlMatchTypeCommand().urlMatchTypes().getText().toUpperCase();
        log.info("urlMatchTypeString: " + urlMatchTypeString);
        UrlMatchingType urlMatchingType = UrlMatchingType.valueOf(urlMatchTypeString);
        mockEndpointRequestDefinition.setUrlMatchingType(urlMatchingType);

        String path = requestDefinitionContext.setPathCommand().STRING().getText();
        log.info("path: " + path);
        mockEndpointRequestDefinition.setPath(path);


        log.info("prioryty = " + requestDefinitionContext.setPriorityCommand().NUMBER());

        Optional.ofNullable(requestDefinitionContext.setPriorityCommand().NUMBER())
                .map(ParseTree::getText)
                .ifPresent(text -> {
                    Long priority = Long.valueOf(text);
                    log.info("priority real: " + priority);
                    mockEndpointRequestDefinition.setPriority(priority);
                });

        requestPropertyProcessorService.processRequestProperties(requestDefinitionContext, mockEndpointRequestDefinition);

        requestBodyRuleProcessorService.processRequestBodyRules(requestDefinitionContext, mockEndpointRequestDefinition);


        return mockEndpointRequestDefinition;
    }
}
