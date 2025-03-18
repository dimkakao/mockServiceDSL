package org.dmytro.demodsl.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;

@TestConfiguration
@Slf4j
@ActiveProfiles("test")
public class WireMockTestConfig {

//    @PostConstruct
//    public void configureWireMock() {
//        log.info("Configuring WireMock for TEST profile");
//        log.info("WireMock port: {}", 8085);
//        WireMock.configureFor("localhost", 8085);
//    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public WireMockServer wireMockServer() {
//        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig().dynamicPort());
//        WireMock.configureFor("localhost", wireMockServer.port());
//        return wireMockServer;
//    }
}
