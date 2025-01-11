package org.dmytro.demodsl.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EndpointDefinitionRequest {
    private String method;
    private String path;
    private String response;
    private int statusCode;
}