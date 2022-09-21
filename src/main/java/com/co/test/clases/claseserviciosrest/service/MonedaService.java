package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.entity.MonedaEntity;
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

    public List<MonedaEntity> findAllMonedas(){
        return repository.findAll();
    }

    public Optional<MonedaEntity> findById(int id){
        return repository.findById(id);
    }

    public String createMoneda(MonedaEntity monedaEntity){
        repository.save(monedaEntity);
        return "exitoso!!!" ;
    }

    public MonedaEntity updateMoneda(MonedaEntity monedaEntity){
        return repository.save(monedaEntity);
    }

    public String deleteMoneda(MonedaEntity monedaEntity){
        repository.delete(monedaEntity);
        return "borrado Exitoso!!!";
    }

}
