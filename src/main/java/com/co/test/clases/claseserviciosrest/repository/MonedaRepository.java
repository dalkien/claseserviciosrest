package com.co.test.clases.claseserviciosrest.repository;

import com.co.test.clases.claseserviciosrest.entity.MonedaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repositorio de operacions contra la base de datos
 */

@Repository
public interface MonedaRepository extends JpaRepository<MonedaEntity,String>, JpaSpecificationExecutor<MonedaEntity> {
    Optional<MonedaEntity> findById(int id);
}
