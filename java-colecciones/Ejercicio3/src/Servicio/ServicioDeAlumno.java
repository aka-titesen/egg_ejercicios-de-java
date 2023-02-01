package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioDeAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        System.out.print("Ingrese el nombre del alumno:");
        String nombre = leer.next();
        List<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota N° " + (i + 1));
            notas.add(leer.nextInt());
        }
        return new Alumno(nombre, notas);
    }

    public ArrayList<Alumno> fabricaDeAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        boolean bandera = true;
        while (bandera) {
            System.out.println("¿Desear agregar un alumno a la lista?");
            System.out.print("Ingrese s/n:");
            switch (leer.next().toUpperCase()) {
                case "S":
                    alumnos.add(crearAlumno());
                    break;
                case "N":
                    bandera = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        return (ArrayList<Alumno>) alumnos;
    }

    public void mostrarTodosLosAlumnos(ArrayList<Alumno> alumnos) {
        if (alumnos.size() == 0) {
            System.out.println("");
            System.out.println("========= No han sido agregados alumnos a la lista =========");
        } else {
            System.out.println("");
            System.out.println("========= Lista de todos los alumnos =========");
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }

        }
    }

    public void mostrarNombreYPromedio(String NombreAlumno, double notaPromedio) {
        System.out.println("");
        System.out.println("========= La nota promedio de " + NombreAlumno + " =========");
        System.out.println("> " + notaPromedio);
    }

    public double calcularNotaPromedio(int indice, ArrayList<Alumno> alumnos) {
        double suma = 0;
        for (int i = 0; i < alumnos.get(indice).getNotas().size(); i++) {
            suma += alumnos.get(indice).getNotas().get(i);
        }
        return Math.round(suma / 3);
    }

    public double notaFinal(String nombreAlumno, ArrayList<Alumno> alumnos) {
        double notaPromedio = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombreAlumno)) {
                notaPromedio = calcularNotaPromedio(i, alumnos);
            }
        }
        mostrarNombreYPromedio(nombreAlumno, notaPromedio);
        return notaPromedio;
    }
}
