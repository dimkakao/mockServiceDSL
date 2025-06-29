package org.dmytro.demodsl.config;


import com.github.tomakehurst.wiremock.client.WireMock;
import jakarta.annotation.PostConstruct;

import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;



@Configuration
@Slf4j
public class ApplicationConfiguration {

    @Bean
    @Profile("!test")
    public RestTemplate restTemplateWithBody() {
        HttpClient httpClient = HttpClients.custom().build();
        return new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
    }

    @Bean
    @Profile("test")
    public RestTemplate testRestTemplateWithBody() {
        HttpClient httpClient = HttpClients.custom().build();
        return new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient));
    }
}
