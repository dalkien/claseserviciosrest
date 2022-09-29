package com.co.test.clases.claseserviciosrest.utils;

public enum ErrorResponse {

    ERROR_DATA(500,"server_error", "Ha ocurrido un error!!! , contacte a servicio tecnico"),
    NOT_FOUND_DATA(404,"no_data","la informacion solicitada no se encuentra disponible ");

    private final int errorCode;
    private final String errorName;
    private final String errorDescription;

    ErrorResponse(int errorCode, String errorName, String errorDescription) {
        this.errorCode = errorCode;
        this.errorName = errorName;
        this.errorDescription = errorDescription;
    }

    public int errorCode(){
        return this.errorCode;
    }

    public String errorname(){
        return this.errorName;
    }

    public String errorDescrition(){
        return this.errorDescription;
    }
}
