package org.dmytro.demodsl.service;

import lombok.RequiredArgsConstructor;
import org.dmytro.demodsl.entity.MockEndpoint;
import org.dmytro.demodsl.repository.MockEndpointRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MockServerService {
    private final MockEndpointRepository repository;

    public List<MockEndpoint> getAllEndpoints() {
        return repository.findAll();
    }

    public MockEndpoint getResponse(String path, String method) {
        System.out.println(path);
        System.out.println(method);
        return repository.findByPathAndMethod(path, method)
                .orElse(new MockEndpoint(null, method, path, "{\"error\":\"Not Found\"}", 404));
    }

    public void addEndpoint(MockEndpoint endpoint) {
        repository.save(endpoint);
    }

    public EndpointBuilder defineEndpoint() {
        return new EndpointBuilder(this);
    }
}
