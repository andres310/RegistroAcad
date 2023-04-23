/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import com.mycompany.registroacadweb.jpa.Estudiante;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author UFG
 */
//public class EstudianteServiceImpl implements IEstudianteServiceLocal { para correrlo deploy local se usa IServiceLocal


@Stateless
public class EstudianteServiceImpl implements IEstudianteServiceLocal {
    
    @Inject
    private IEstudianteDao iestudianteDao;

    @Override
    public List<Estudiante> listarEstudiantes() {
        return iestudianteDao.buscarTodosEstudiante();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Estudiante estudiante) {
        return iestudianteDao.buscarEstudiantePorId(estudiante);
    }
    
    @Override
    public Estudiante buscarEstudiantePorCarnet(Estudiante estudiante) {
        return iestudianteDao.buscarEstudiantePorCarnet(estudiante);
    }

    @Override
    public Estudiante buscarEstudiantePorEmail(Estudiante estudiante) {
        return null;
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        iestudianteDao.insertarEstudiante(estudiante);
    }

    @Override
    public void modificarEstudiante(Estudiante estudiante) {
        iestudianteDao.modificarEstudiante(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        iestudianteDao.borrarEstudiante(estudiante);
    }
    
}
