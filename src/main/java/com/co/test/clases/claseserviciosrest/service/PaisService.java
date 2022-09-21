package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.entity.PaisEntity;
import com.co.test.clases.claseserviciosrest.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaisService {

    private final PaisRepository repository;

    @Autowired
    public PaisService(PaisRepository repository) {
        this.repository = repository;
    }

    public Optional<PaisEntity> getPaisById(int id){
        return repository.findById(id);
    }

    public PaisEntity createPais(PaisEntity paisEntity){
        return repository.save(paisEntity);
    }
}
