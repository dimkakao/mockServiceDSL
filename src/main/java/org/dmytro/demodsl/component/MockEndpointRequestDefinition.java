package org.dmytro.demodsl.component;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.dmytro.demodsl.deserializer.HttpStatusDeserializer;
import org.dmytro.demodsl.validation_rule.RequestBodyValidationRule;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class MockEndpointRequestDefinition {
    @NotNull
    private HttpRequestMethod method;

    @NotBlank
    private String path;
    private String response;
    @JsonDeserialize(using = HttpStatusDeserializer.class)
    private HttpStatus statusCode;
    @Min(1)
    @Max(100)
    private Long priority;
    @NotNull
    private RequestBodyValidationRule requestBodyValidationRule;
}
