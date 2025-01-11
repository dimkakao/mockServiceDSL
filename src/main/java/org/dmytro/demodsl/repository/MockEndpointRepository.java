package org.dmytro.demodsl.repository;

import org.dmytro.demodsl.entity.MockEndpoint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MockEndpointRepository extends JpaRepository<MockEndpoint, Long> {
    Optional<MockEndpoint> findByPathAndMethod(String path, String method);
}
