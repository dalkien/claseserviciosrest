package com.co.test.clases.claseserviciosrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name = "categoria", schema = "carrera", catalog = "")
public class CategoriaEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nombre_categoria")
    private String nombreCategoria;
    @Basic
    @Column(name = "total_participantes")
    private int totalParticipantes;
    @Basic
    @Column(name = "rango_edad_minima")
    private int rangoEdadMinima;
    @Basic
    @Column(name = "rango_edad_maxima")
    private int rangoEdadMaxima;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

}
