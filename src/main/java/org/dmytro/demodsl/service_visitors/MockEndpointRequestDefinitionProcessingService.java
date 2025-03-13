package org.dmytro.demodsl.service_visitors;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.entity.request_property.RequestCookie;
import org.dmytro.demodsl.entity.request_property.RequestFormParam;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
                .ifPresent(requestQueryParamsContext -> {
                    List<RequestQueryParam> requestQueryParams
                            = requestPropertyProcessorService.mapRequestQueryParamsContextToListOfRequestQueryParam(requestQueryParamsContext);
                    mockEndpointRequestDefinition.setRequestQueryParams(requestQueryParams);
                });

        Optional.ofNullable(requestDefinitionContext.requestHeaders())
                .ifPresent(requestHeadersContext -> {
                    List<RequestHeader> requestHeaders
                            = requestPropertyProcessorService.mapRequestHeadersContextToListOfRequestHeader(requestHeadersContext);
                    mockEndpointRequestDefinition.setRequestHeaders(requestHeaders);
                });

//        List<RequestHeader> requestHeaders
//                = requestPropertyProcessorService.mapRequestHeadersContextToListOfRequestHeader(requestDefinitionContext.requestHeaders());
//
//        mockEndpointRequestDefinition.setRequestHeaders(requestHeaders);

        Optional.ofNullable(requestDefinitionContext.requestCookies())
                .ifPresent(requestCookiesContext -> {
                    List<RequestCookie> requestCookies
                            = requestPropertyProcessorService.mapRequestCookiesContextToListOfRequestCookie(requestCookiesContext);
                    mockEndpointRequestDefinition.setRequestCookies(requestCookies);
                });

//        List<RequestCookie> requestCookies
//                = requestPropertyProcessorService.mapRequestCookiesContextToListOfRequestCookie(requestDefinitionContext.requestCookies());
//        mockEndpointRequestDefinition.setRequestCookies(requestCookies);

        Optional.ofNullable(requestDefinitionContext.requestFormParams())
                .ifPresent(requestFormParamsContext -> {
                    List<RequestFormParam> requestFormParams
                            = requestPropertyProcessorService.mapRequestFormParamsContextToListOfRequestFormParam(requestFormParamsContext);
                    mockEndpointRequestDefinition.setRequestFormParams(requestFormParams);
                });
//        List<RequestFormParam> requestFormParams
//                = requestPropertyProcessorService.mapRequestFormParamsContextToListOfRequestFormParam(requestDefinitionContext.requestFormParams());
//
//        mockEndpointRequestDefinition.setRequestFormParams(requestFormParams);


        return mockEndpointRequestDefinition;
    }
}
