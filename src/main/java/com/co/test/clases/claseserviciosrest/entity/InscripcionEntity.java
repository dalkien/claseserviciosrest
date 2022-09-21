package com.co.test.clases.claseserviciosrest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name = "inscripcion", schema = "carrera", catalog = "")
public class InscripcionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "id_participante")
    private int idParticipante;
    @Basic
    @Column(name = "id_categoria")
    private int idCategoria;
    @Basic
    @Column(name = "costo")
    private BigDecimal costo;
    @Basic
    @Column(name = "posicion_inicial")
    private int posicionInicial;
    @Basic
    @Column(name = "fecha_carrera")
    private Date fechaCarrera;

/*    @ManyToOne
    @JoinColumn(name = "idParticipante", nullable = false, insertable = false, updatable = false)
    private ParticipanteEntity participante;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false, insertable = false, updatable = false)
    private CategoriaEntity categoria;*/
}
