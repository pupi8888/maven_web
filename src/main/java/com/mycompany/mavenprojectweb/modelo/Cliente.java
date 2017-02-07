/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectweb.modelo;

import javax.persistence.Entity;

/**
 *
 * @author pupi
 */
@Entity
public class Cliente extends AbstractModel{
    private String cuit;
    private String nombre;

    public Cliente(String cuit, String nombre) {
        this.cuit = cuit;
        this.nombre = nombre;
    }

    public Cliente() {
    }
    
    

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
