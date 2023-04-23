/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroacadweb.web;

import Services.IEstudianteServiceLocal;
import com.mycompany.registroacadweb.jpa.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author andres
 */

@Named("estudianteBean")
@RequestScoped
public class EstudianteBean {
    
    @Inject
    private IEstudianteServiceLocal estudianteService;
    private Estudiante estudianteSeleccionado;
    List<Estudiante> estudiantes = new ArrayList();
    
    public EstudianteBean(){}
    
    @PostConstruct
    public void inicializar() {
        // Inicializando variables
        estudiantes = estudianteService.listarEstudiantes();
        estudianteSeleccionado = new Estudiante();
    }
    
    public void editEstudiante(RowEditEvent event) {
        Estudiante estudiante = (Estudiante) event.getObject();
        estudianteService.modificarEstudiante(estudiante);
    }
    
    // Get y set respectivos
    public Estudiante getEstudianteSeleccionado() {
        return estudianteSeleccionado;
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public void setEstudiantes(List<Estudiante> e) {
        estudiantes = e;
    }
}
