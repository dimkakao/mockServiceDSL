package org.dmytro.demodsl;

import org.dmytro.demodsl.service.MockServerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockServerInitializer implements CommandLineRunner {
    private final MockServerService service;

    public MockServerInitializer(MockServerService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {

        service.defineEndpoint()
                .get()
                .path("/mock/api/users")
                .response(
                       """
                       [
                           {
                               "id": 1,
                               "name": "John"
                           }
                       ]
                       """)
                .status(200)
                .register();

        service.defineEndpoint()
                .post()
                .path("/mock/api/users")
                .response(
                       """
                       {
                           "message": "User created"
                       }
                       """)
                .status(201)
                .register();

        service.defineEndpoint()
                .get()
                .path("/mock/api/error")
                .response(
                       """
                       {
                           "error": "Internal Server Error"
                       }
                       """)
                .status(500)
                .register();


        System.out.println("Mock server endpoints initialized via DSL in service!");
    }
}
