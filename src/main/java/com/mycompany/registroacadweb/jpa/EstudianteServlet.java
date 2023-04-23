/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.registroacadweb.jpa;


import Services.IEstudianteServiceLocal;
import Services.IEstudianteServiceRemote;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andres
 */
@WebServlet("/estudiantes")
public class EstudianteServlet extends HttpServlet {
    
    @Inject
//    IEstudianteServiceRemote estudianteService;
    IEstudianteServiceLocal estudianteService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            List<Estudiante> estudiantes = estudianteService.listarEstudiantes();
            System.out.println("Estudiantes: " + estudiantes);
            request.setAttribute("estudiantes", estudiantes);
            request.getRequestDispatcher("/listadoEstudiantes.jsp").forward(request, response);
    }
}
