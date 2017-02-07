/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectweb.controlador;

import com.mycompany.mavenprojectweb.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author pupi
 */
@ManagedBean
@SessionScoped
public class ClientesManagedBean {
    private List<Cliente> clientes = new ArrayList<>();
    
    @PostConstruct
    private void createClientes() {
        for (int i = 0;i < 10; i++) {
            clientes.add(new Cliente(Integer.toString(i),"Nombre: " + Integer.toString(i)));
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
