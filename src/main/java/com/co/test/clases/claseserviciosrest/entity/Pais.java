package com.co.test.clases.claseserviciosrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pais", schema = "carrera", catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pais {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nombre_pais")
    private String nombrePais;
    @Basic
    @Column(name = "cod_pais")
    private String codPais;
    @Basic
    @Column(name = "id_moneda")
    private int idMoneda;

}
