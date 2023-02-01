package principal.logica;

import java.util.List;
import principal.persistencia.PersistenceController;

public class Controladora {

    PersistenceController persisController = new PersistenceController();
//---------Alumno---------

    public void crearAlumno(Alumno alu) {
        persisController.crearAlumno(alu);
    }

    public void eliminarAlumno(int id) {
        persisController.eliminarAlumno(id);
    }

    public void editarAlumno(Alumno alu) {
        persisController.editarAlumno(alu);
    }

    public Alumno traerAlumno(int id) {
        return persisController.traerAlumno(id);
    }

    public List<Alumno> traerAlumnos() {
        return persisController.traerAlumnos();
    }

    //---------Carrera---------
    public void crearCarrera(Carrera materia) {
        persisController.crearCarrera(materia);
    }

    public void eliminarCarrera(int id) {
        persisController.eliminarCarrera(id);
    }

    public void editarCarrera(Carrera materia) {
        persisController.editarCarrera(materia);
    }

    public Carrera traerCarrera(int id) {
        return persisController.traerCarrera(id);
    }

    public List<Carrera> traerCarreras() {
        return persisController.traerCarreras();

    }
    //---------Materia---------

    public void crearMateria(Materia materia) {
        persisController.crearMateria(materia);
    }

    public void eliminarMateria(int id) {
        persisController.eliminarMateria(id);
    }

    public void editarMateria(Materia materia) {
        persisController.editarMateria(materia);
    }

    public Materia traerMateria(int id) {
        return persisController.traerMateria(id);
    }

    public List<Materia> traerMaterias() {
        return persisController.traerMaterias();
    }
}
