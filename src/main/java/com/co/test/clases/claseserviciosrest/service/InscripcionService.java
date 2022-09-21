package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.entity.InscripcionEntity;
import com.co.test.clases.claseserviciosrest.repository.IncripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class InscripcionService {
    private final IncripcionRepository inscripcion;

    @Autowired
    public InscripcionService (IncripcionRepository inscripcion){
        this.inscripcion = inscripcion;

    }
    public String creacionDatos (InscripcionEntity variable1){
        this.inscripcion.save(variable1);
        return "Dato creado con exito.";
    }
    public Optional<InscripcionEntity> consultaInscripcion (int id){
        return this.inscripcion.findById(id);
    }
}
