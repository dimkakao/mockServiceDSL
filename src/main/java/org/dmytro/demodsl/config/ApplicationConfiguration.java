package org.dmytro.demodsl.config;


import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.annotation.PostConstruct;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;



@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate restTemplateWithBody() {
        HttpClient httpClient = HttpClients.custom().build();
        return new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
    }
    @PostConstruct
    public void configureWireMock() {
        WireMock.configureFor("localhost", 8081);
    }

}
