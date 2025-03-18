package org.dmytro.demodsl.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.request_body_rule.RequestBodyRule;
import org.dmytro.demodsl.entity.request_property.RequestCookie;
import org.dmytro.demodsl.entity.request_property.RequestFormParam;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.util.StringUtils;

import java.util.List;

@Getter
@Setter
public class MockEndpointRequestDefinition {
    @NotNull
    private HttpRequestMethod method;

    @NotNull
    private UrlMatchingType urlMatchingType;
    @NotBlank
    private String path;

    @Min(1)
    @Max(100)
    private Integer priority = 50;

    private List<RequestQueryParam> requestQueryParams;
    private List<RequestHeader> requestHeaders;
    private List<RequestCookie> requestCookies;
    private List<RequestFormParam> requestFormParams;

    @NotNull
    private List<RequestBodyRule> requestBodyRules;

    @Override
    public String toString() {
        return """
                MockEndpointRequestDefinition{
                    method=%s,
                    urlMatchingType=%s,
                    path='%s',
                    priority=%d,
                    requestQueryParams=%s,
                    requestHeaders=%s,
                    requestCookies=%s,
                    requestFormParams=%s,
                    requestBodyRules=%s
                }
                """.formatted(method, urlMatchingType, path, priority,
                StringUtils.indent(requestQueryParams == null ? "not present" : requestQueryParams.toString()),
                StringUtils.indent(requestHeaders == null ? "not present" :  requestHeaders.toString()),
                StringUtils.indent(requestCookies == null ? "not present" : requestCookies.toString()),
                StringUtils.indent(requestFormParams == null ? "not present" : requestFormParams.toString()),
                StringUtils.indent(requestBodyRules == null ? "not present" : requestBodyRules.toString()))
                ;
    }

}
