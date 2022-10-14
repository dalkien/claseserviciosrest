package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.utils.client.gen.CarreraRequest;
import com.co.test.clases.claseserviciosrest.utils.client.gen.CarreraResponse;
import com.co.test.clases.claseserviciosrest.utils.config.ResultadoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoService {

    private final ResultadoClient client;

    @Autowired
    public ResultadoService(ResultadoClient client) {
        this.client = client;
    }

    public CarreraResponse findCarreraResult(CarreraRequest carreraRequest){

        return client.findResultCarrera(carreraRequest);
    }
}
