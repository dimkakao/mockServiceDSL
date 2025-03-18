package org.dmytro.demodsl.service_visitors;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.ObjectUtils;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Pattern;

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

        String path = requestDefinitionContext.setPathCommand().STRING().getText().replace("\"", "");

        boolean hasQueryParamsInUrl = Pattern.compile("\\?.+=.*").matcher(path).find();
        if ((urlMatchingType.equals(UrlMatchingType.PATH) || urlMatchingType.equals(UrlMatchingType.PATH_REGEX))
                && hasQueryParamsInUrl
        ) {
            throw ExceptionUtils.illegalArgument("Query params are not allowed for PATH and PATH_REGEX url matching types and must be specified separately in the query params definition section");
        }

        log.info("path: " + path);
        mockEndpointRequestDefinition.setPath(path);

        log.info("priority = " + requestDefinitionContext.setPriorityCommand().NUMBER());

        Optional.ofNullable(requestDefinitionContext.setPriorityCommand().NUMBER())
                .map(ParseTree::getText)
                .ifPresent(text -> {
                    Integer priority = Integer.valueOf(text);
                    log.info("priority real: " + priority);
                    mockEndpointRequestDefinition.setPriority(priority);
                });

        requestPropertyProcessorService.processRequestProperties(requestDefinitionContext, mockEndpointRequestDefinition);

        if ((urlMatchingType.equals(UrlMatchingType.PATH_AND_QUERY) || urlMatchingType.equals(UrlMatchingType.PATH_AND_QUERY_REGEX))
                && ObjectUtils.isNotEmpty(mockEndpointRequestDefinition.getRequestQueryParams())) {
            throw ExceptionUtils.illegalArgument("Query params are required for PATH_AND_QUERY and PATH_AND_QUERY_REGEX url matching types and must be specified in the path and not in the query params definition section");
        }

        requestBodyRuleProcessorService.processRequestBodyRules(requestDefinitionContext, mockEndpointRequestDefinition);


        return mockEndpointRequestDefinition;
    }
}
