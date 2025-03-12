package org.dmytro.demodsl.service_visitors;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Supplier;

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


        Optional.ofNullable(requestDefinitionContext.requestQueryParams())
                .map(DmytroMockDSLParser.RequestQueryParamsContext::requestQueryParamRule)
                .ifPresent(requestQueryParamRuleContexts -> {
                    List<RequestQueryParam> requestQueryParams = requestQueryParamRuleContexts.stream()
                            .map(requestQueryParamRuleContext -> {
                                return processRequestPropertyRuleContext(
                                        requestQueryParamRuleContext.setNameCommand().STRING().getText(),
                                        requestQueryParamRuleContext.condition(),
                                        RequestQueryParam::new
                                );
//                                String propertyName = requestQueryParamRuleContext.setNameCommand().STRING().getText();
//                                System.out.println("propertyName: " + propertyName);
//                                RequestQueryParam requestQueryParam = requestPropertyProcessorService.processRequestProperty(
//                                        propertyName,
//                                        requestQueryParamRuleContext::condition,
//                                        RequestQueryParam::new
//                                );
//                                System.out.println("requestQueryParam: " + requestQueryParam);
//                                return requestQueryParam;
                            })
                            .toList();
                    mockEndpointRequestDefinition.setRequestQueryParams(requestQueryParams);
                });

        return mockEndpointRequestDefinition;

//        DmytroMockDSLParser.MockEndpointRequestDefinitionContext context = (DmytroMockDSLParser.MockEndpointRequestDefinitionContext) tree;
//        mockEndpointRequestDefinition.setMethod(context.method().getText());
//        mockEndpointRequestDefinition.setPath(context.path().getText());
//        mockEndpointRequestDefinition.setRequestBodyRule(new RequestBodyRuleVisitor().visitRequestBodyRule(context.requestBodyRule()));
//        mockEndpointRequestDefinition.setResponseRule(new ResponseRuleVisitor().visitResponseRule(context.responseRule()));
//        return mockEndpointRequestDefinition;
    }

    private <T extends RequestProperty> T processRequestPropertyRuleContext(
            @NotBlank String propertyName,
            @NotNull DmytroMockDSLParser.ConditionContext conditionContext,
            BiFunction<String, Condition, T> requestPropertyAggregator
    ) {
        System.out.println("propertyName: " + propertyName);
        T requestProperty = requestPropertyProcessorService.processRequestProperty(
                propertyName,
                conditionContext,
                requestPropertyAggregator
        );
        System.out.println("RequestProperty: " + requestProperty);
        return requestProperty;
    }


}
