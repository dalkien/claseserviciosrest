package com.co.test.clases.claseserviciosrest.dto;

public class Respuesta {

    private String tipo;
    private String documento;

    public Respuesta() {
    }

    public Respuesta(String tipo, String documento) {
        this.tipo = tipo;
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
