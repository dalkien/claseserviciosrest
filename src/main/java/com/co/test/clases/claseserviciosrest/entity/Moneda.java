package com.co.test.clases.claseserviciosrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * clase de tipo entidad para la tabla de moneda
 */

@Entity
@Table(name = "MONEDA")
public class Moneda implements Serializable {

    private static final long serializableVersion = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "nommbre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

    public Moneda(){}

    public Moneda(int id, String nombre, String codigo){
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
