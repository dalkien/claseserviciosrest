package com.co.test.clases.claseserviciosrest.repository;


import com.co.test.clases.claseserviciosrest.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity,Integer>, JpaSpecificationExecutor<PaisEntity> {

}
