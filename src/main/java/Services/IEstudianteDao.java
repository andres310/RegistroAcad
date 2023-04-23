/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import com.mycompany.registroacadweb.jpa.Estudiante;
import java.util.List;

/**
 *
 * @author UFG
 */
public interface IEstudianteDao {
    public List<Estudiante> buscarTodosEstudiante();
    
    public Estudiante buscarEstudiantePorId(Estudiante estudiante);
    
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante);
    
    public void insertarEstudiante(Estudiante estudiante);
    
    public void modificarEstudiante(Estudiante estudiante);
    
    public void borrarEstudiante(Estudiante estudiante);
}
