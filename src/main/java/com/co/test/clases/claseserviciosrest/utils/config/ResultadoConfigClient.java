package com.co.test.clases.claseserviciosrest.utils.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ResultadoConfigClient {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.co.test.clases.claseserviciosrest.utils.client.gen");
        return marshaller;
    }

    @Bean
    public ResultadoClient resultadoClient (Jaxb2Marshaller marshaller) {
        ResultadoClient client = new ResultadoClient();
        client.setDefaultUri("http://localhost:8091/WS/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
