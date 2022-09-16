package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.entity.Moneda;
import com.co.test.clases.claseserviciosrest.repository.MonedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonedaService {

    private final MonedaRepository repository;

    @Autowired
    public MonedaService(MonedaRepository repository) {
        this.repository = repository;
    }

    /**
     * curd ->
     * c -> create -> es un insercion de registro en tablas
     * u -> update -> es una actualizacion de registro en tablas
     * r -> read -> es una lectura de registro en tablas
     * d -> delete -> es una eliminacion de registros en tablas
     */

    public List<Moneda> findAllMonedas(){
        return repository.findAll();
    }

    public Optional<Moneda> findById(int id){
        return repository.findById(id);
    }

    public String createMoneda(Moneda moneda){
        repository.save(moneda);
        return "exitoso!!!";
    }

    public Moneda updateMoneda(Moneda moneda){
        return repository.save(moneda);
    }

    public String deleteMoneda(Moneda moneda){
        repository.delete(moneda);
        return "borrado Exitoso!!!";
    }

}
