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
@Table(name = "participante", schema = "carrera", catalog = "")
public class ParticipanteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "identificacion")
    private String identificacion;
    @Basic
    @Column(name = "edad")
    private int edad;
    @Basic
    @Column(name = "id_categoria")
    private int idCategoria;
    @Basic
    @Column(name = "id_nacionalidad")
    private int idNacionalidad;
    @Basic
    @Column(name = "sexo")
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "idNacionalidad", nullable = false)
    private PaisEntity pais;

}
