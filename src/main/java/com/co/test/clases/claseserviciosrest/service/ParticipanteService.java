package com.co.test.clases.claseserviciosrest.service;

import com.co.test.clases.claseserviciosrest.entity.ParticipanteEntity;
import com.co.test.clases.claseserviciosrest.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ParticipanteService {

    private final ParticipanteRepository participanteRepository;

    @Autowired
    public  ParticipanteService(ParticipanteRepository participanteRepository){ this.participanteRepository = participanteRepository;}

    public String createParticipante (ParticipanteEntity participanteEntity){
        participanteRepository.save(participanteEntity);
        return "exito";
    }

    public Optional<ParticipanteEntity> findByid(int id){return participanteRepository.findById(id);}
}
