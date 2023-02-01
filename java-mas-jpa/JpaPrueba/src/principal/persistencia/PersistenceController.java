package principal.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import principal.logica.Alumno;
import principal.logica.Carrera;
import principal.logica.Materia;
import principal.persistencia.exceptions.NonexistentEntityException;

public class PersistenceController {

    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController mateJpa = new MateriaJpaController();

//---------Alumno---------
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public List<Alumno> traerAlumnos() {
        return aluJpa.findAlumnoEntities();
    }
//---------Carrera---------

    public void crearCarrera(Carrera carrera) {
        carreJpa.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carrera) {
        try {
            carreJpa.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public List<Carrera> traerCarreras() {
        return carreJpa.findCarreraEntities();
    }
//---------Materia---------
    public void crearMateria(Materia materia) {
        mateJpa.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            mateJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            mateJpa.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return mateJpa.findMateria(id);
    }

    public List<Materia> traerMaterias() {
       return mateJpa.findMateriaEntities();
    }

}
