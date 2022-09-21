package com.co.test.clases.claseserviciosrest.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * clase de tipo entidad para la tabla de moneda
 */

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "MONEDA")
public class MonedaEntity implements Serializable {

    private static final long serializableVersion = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "nommbre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

/*    @OneToMany(mappedBy="idMoneda", cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private List<Pais> paises; */
}
