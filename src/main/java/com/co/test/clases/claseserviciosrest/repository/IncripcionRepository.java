package com.co.test.clases.claseserviciosrest.repository;

import com.co.test.clases.claseserviciosrest.entity.InscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IncripcionRepository extends JpaRepository<InscripcionEntity, Integer>, JpaSpecificationExecutor<InscripcionEntity> {
}
