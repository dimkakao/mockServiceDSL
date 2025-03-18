package org.dmytro.demodsl.config;

import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
@Profile("test")
public class TestApplicationConfiguration {

//    @PostConstruct
//    public void configureWireMock() {
//        log.info("Configuring WireMock for TEST profile");
//        log.info("WireMock port: {}", 8085);
//        WireMock.configureFor("localhost", 8085);
//    }
}
