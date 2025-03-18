package org.dmytro.demodsl.config;

import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Slf4j
@Profile("dev")
public class DevApplicationConfiguration {

    @PostConstruct
    public void configureWireMock() {
        log.info("Configuring WireMock for DEV profile");
        WireMock.configureFor("localhost", 8080);
    }
}
