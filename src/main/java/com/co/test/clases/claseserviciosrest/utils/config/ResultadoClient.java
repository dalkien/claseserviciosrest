package com.co.test.clases.claseserviciosrest.utils.config;

import com.co.test.clases.claseserviciosrest.utils.client.gen.CarreraRequest;
import com.co.test.clases.claseserviciosrest.utils.client.gen.CarreraResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class ResultadoClient extends WebServiceGatewaySupport {

    public CarreraResponse findResultCarrera(CarreraRequest info){
        CarreraResponse response = (CarreraResponse)  getWebServiceTemplate()
                .marshalSendAndReceive(info);
        return response;
    }
}
