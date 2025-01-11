package org.dmytro.demodsl.service;

import org.dmytro.demodsl.entity.MockEndpoint;
import org.springframework.stereotype.Component;

@Component
public class EndpointBuilder {
    private final MockServerService service;
    private String method;
    private String path;
    private String response;
    private int statusCode = 200;

    public EndpointBuilder(MockServerService service) {
        this.service = service;
    }

    public EndpointBuilder method(String method) {
        this.method = method;
        return this;
    }

    public EndpointBuilder get() {
        this.method = "GET";
        return this;
    }

    public EndpointBuilder post() {
        this.method = "POST";
        return this;
    }

    public EndpointBuilder path(String path) {
        this.path = path;
        return this;
    }

    public EndpointBuilder response(String response) {
        this.response = response;
        return this;
    }

    public EndpointBuilder status(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public void register() {
        if (method == null || path == null || response == null) {
            throw new IllegalArgumentException("Method, path, and response must be defined");
        }
        MockEndpoint endpoint = new MockEndpoint(null, method, path, response, statusCode);
        service.addEndpoint(endpoint);
    }
}
