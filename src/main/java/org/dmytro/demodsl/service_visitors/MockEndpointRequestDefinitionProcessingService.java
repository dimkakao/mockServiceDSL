package org.dmytro.demodsl.service_visitors;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MockEndpointRequestDefinitionProcessingService {

    private static final RequestPropertyProcessorService requestPropertyProcessorService = new RequestPropertyProcessorService();

    public MockEndpointRequestDefinition visitMockEndpointRequestDefinition(DmytroMockDSLParser.RequestDefinitionContext requestDefinitionContext) {

        MockEndpointRequestDefinition mockEndpointRequestDefinition = new MockEndpointRequestDefinition();

        String httpMethodText = requestDefinitionContext.setHttpMethodCommand().httpMethodTypes().getText().toUpperCase();
        System.out.println("httpMethodText: " + httpMethodText);
        HttpRequestMethod method = HttpRequestMethod.valueOf(httpMethodText);
        mockEndpointRequestDefinition.setMethod(method);

        String urlMatchTypeString = requestDefinitionContext.setUrlMatchTypeCommand().urlMatchTypes().getText().toUpperCase();
        System.out.println("urlMatchTypeString: " + urlMatchTypeString);
        UrlMatchingType urlMatchingType = UrlMatchingType.valueOf(urlMatchTypeString);
        mockEndpointRequestDefinition.setUrlMatchingType(urlMatchingType);

        String path = requestDefinitionContext.setPathCommand().STRING().getText();
        System.out.println("path: " + path);
        mockEndpointRequestDefinition.setPath(path);


        System.out.println("prioryty = " + requestDefinitionContext.setPriorityCommand().NUMBER());

        Optional.ofNullable(requestDefinitionContext.setPriorityCommand().NUMBER())
                .map(ParseTree::getText)
                .ifPresent(text -> {
                    Long priority = Long.valueOf(text);
                    System.out.println("priority real: " + priority);
                    mockEndpointRequestDefinition.setPriority(priority);
                });

        List<RequestQueryParam> requestQueryParams
                = requestPropertyProcessorService.mapRequestQueryParamsContextToListOfRequestQueryParam(requestDefinitionContext.requestQueryParams());

        mockEndpointRequestDefinition.setRequestQueryParams(requestQueryParams);

        List<RequestHeader> requestHeaders
                = requestPropertyProcessorService.mapRequestHeadersContextToListOfRequestHeader(requestDefinitionContext.requestHeaders());

        mockEndpointRequestDefinition.setRequestHeaders(requestHeaders);

//        Optional.ofNullable(requestDefinitionContext.requestQueryParams())
//                .map(DmytroMockDSLParser.RequestQueryParamsContext::requestQueryParamRule)
//                .map(this::mapRequestQueryParamsContextToListOfRequestQueryParam)
//                {
//                    return requestQueryParamRuleContexts.stream()
//                            .map(requestQueryParamRuleContext -> mapRequestQueryParamRuleContextToRequestQueryParams(requestQueryParamRuleContext))
//                                    processRequestPropertyRuleContext(
//                                            requestQueryParamRuleContext.setNameCommand().STRING().getText(),
//                                            requestQueryParamRuleContext.condition(),
//                                            RequestQueryParam::new
//                                    ))
//                            .toList();
//                })
//                .ifPresent(mockEndpointRequestDefinition::setRequestQueryParams);

        return mockEndpointRequestDefinition;

//        DmytroMockDSLParser.MockEndpointRequestDefinitionContext context = (DmytroMockDSLParser.MockEndpointRequestDefinitionContext) tree;
//        mockEndpointRequestDefinition.setMethod(context.method().getText());
//        mockEndpointRequestDefinition.setPath(context.path().getText());
//        mockEndpointRequestDefinition.setRequestBodyRule(new RequestBodyRuleVisitor().visitRequestBodyRule(context.requestBodyRule()));
//        mockEndpointRequestDefinition.setResponseRule(new ResponseRuleVisitor().visitResponseRule(context.responseRule()));
//        return mockEndpointRequestDefinition;
    }

}
