package org.dmytro.demodsl.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.dmytro.demodsl.dto.EndpointDefinitionRequest;
import org.dmytro.demodsl.entity.MockEndpoint;
import org.dmytro.demodsl.service.MockServerService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mock")
@RequiredArgsConstructor
public class MockServerController {
    private final MockServerService service;

    @GetMapping("/endpoints")
    public List<MockEndpoint> getAllEndpoints() {
        return service.getAllEndpoints();
    }

    @PostMapping("/endpoints")
    public ResponseEntity<String> defineEndpoint(@RequestBody EndpointDefinitionRequest request) {
        service.defineEndpoint()
                .method(request.getMethod())
                .path(request.getPath())
                .response(request.getResponse())
                .status(request.getStatusCode())
                .register();
        return ResponseEntity.ok("Endpoint defined via DSL");
    }

    @RequestMapping("**")
    public ResponseEntity<String> handleRequest(HttpServletRequest request) {
        String path = request.getRequestURI();
        String method = request.getMethod();

        MockEndpoint endpoint = service.getResponse(path, method);

        return ResponseEntity
                .status(endpoint.getStatusCode())
                .contentType(MediaType.APPLICATION_JSON)
                .body(endpoint.getResponse());
    }

    public Map<String, Object> get(List<Object> objects) {
        return objects.stream()
                .collect(Collectors.toMap(o -> "", Function.identity()));
    }

}
