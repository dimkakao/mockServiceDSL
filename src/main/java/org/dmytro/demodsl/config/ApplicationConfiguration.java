package org.dmytro.demodsl.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public WireMockServer wireMockServer() {
//        WireMockServer wireMockServer = new WireMockServer(8081); // Порт для мок-сервера
//        wireMockServer.stubFor(get(urlEqualTo("/api/example"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withHeader("Content-Type", "application/json")
//                        .withBody("{\"message\":\"Hello from WireMock!\"}")));
//        return wireMockServer;
//    }
}
