
import ciclovidajpa.PersistenceJPA;
import com.mycompany.registroacadweb.jpa.Estudiante;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UFG
 */
public class test {
    public static void main(String[] args) {
        PersistenceJPA.crearEstudiante();
        PersistenceJPA.recuperarEstudiante();
        PersistenceJPA.modificarEstudiante();
        PersistenceJPA.eliminarEstudiante();
    }
}
