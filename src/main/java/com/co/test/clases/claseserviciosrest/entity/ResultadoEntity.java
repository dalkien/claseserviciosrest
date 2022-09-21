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
@Table(name = "resultado", schema = "carrera", catalog = "")
public class ResultadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "id_participante")
    private int idParticipante;
    @Basic
    @Column(name = "id_inscripcion")
    private int idInscripcion;
    @Basic
    @Column(name = "posicion_final")
    private int posicionFinal;
    @Basic
    @Column(name = "premio")
    private int premio;
    @Basic
    @Column(name = "detalle_premio")
    private String detallePremio;

    @ManyToOne
    @JoinColumn(name = "idParticipante", nullable = false)
    private ParticipanteEntity participante;

    @ManyToOne
    @JoinColumn(name = "idInscripcion", nullable = false)
    private InscripcionEntity inscripcion;

}
