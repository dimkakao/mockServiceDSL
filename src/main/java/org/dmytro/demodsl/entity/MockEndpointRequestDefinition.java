package org.dmytro.demodsl.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.entity.request_body_rule.RequestBodyRule;
import org.dmytro.demodsl.entity.request_property.RequestCookie;
import org.dmytro.demodsl.entity.request_property.RequestFormParam;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;

import java.util.List;

@Getter
@Setter
@ToString
public class MockEndpointRequestDefinition {
    @NotNull
    private HttpRequestMethod method;

    @NotNull
    private UrlMatchingType urlMatchingType;
    @NotBlank
    private String path;

    @Min(1)
    @Max(100)
    private Long priority = 50L;

    private List<RequestQueryParam>  requestQueryParams;
    private List<RequestHeader> requestHeaders;
    private List<RequestCookie> requestCookies;
    private List<RequestFormParam> requestFormParams;

    @NotNull
    private List<RequestBodyRule> requestBodyRules;

//    @JsonDeserialize(using = HttpStatusDeserializer.class)
//    private HttpStatus statusCode;
//    private String response;
//    @NotNull
//    private RequestBodyValidationRule requestBodyValidationRule;
}
