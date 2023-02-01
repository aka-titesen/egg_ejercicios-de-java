package ejercicio3;

import Entidad.Alumno;
import Servicio.ServicioDeAlumno;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        ServicioDeAlumno sda = new ServicioDeAlumno();

        List<Alumno> alumnos = sda.fabricaDeAlumnos();

        sda.mostrarTodosLosAlumnos((ArrayList<Alumno>) alumnos);

        sda.notaFinal("Facundo", (ArrayList<Alumno>) alumnos);
    }

}
