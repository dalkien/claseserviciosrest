package com.co.test.clases.claseserviciosrest.repository;

import com.co.test.clases.claseserviciosrest.entity.ParticipanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends JpaRepository<ParticipanteEntity, Integer>, JpaSpecificationExecutor<ParticipanteEntity> {
}
