/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenprojectweb.controlador;

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
public class ProfileImageBackingBean {
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
            int i = 1;
            for (i=1;i<5;i++) {
                images.add("fem" + i + ".png");
                images.add("male" + i + ".png");
            }        
    }
 
    public List<String> getImages() {
        return images;
    }
}
