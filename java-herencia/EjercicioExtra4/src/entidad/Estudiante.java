package entidad;

import java.util.Scanner;

public class Estudiante extends Persona {

    private String curso;
    private static int contadorEstudiante;

    public Estudiante() {
        if (contadorEstudiante == 0) {
            contadorEstudiante = 1;
        }
        this.id = contadorEstudiante++;
    }

    public Estudiante(String curso) {
        this.curso = curso;
        if (contadorEstudiante == 0) {
            contadorEstudiante = 1;
        }
        this.id = contadorEstudiante++;
    }

    public Estudiante(String curso, String nombre, String apellido, String estadoCivil) {
        super(nombre, apellido, estadoCivil);
        this.curso = curso;
        if (contadorEstudiante == 0) {
            contadorEstudiante = 1;
        }
        this.id = contadorEstudiante++;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static int getContadorEstudiante() {
        return contadorEstudiante;
    }

    public static void setContadorEstudiante(int contadorEstudiante) {
        Estudiante.contadorEstudiante = contadorEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String estadoCivil() {
        String estadoCivil = "";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean menu = true;
        System.out.println("### Elija el estado civil ### ");
        while (menu) {
            System.out.println("1: Soltero | 2: Casado | 3: Divorciado | 4: Vuido");
            switch (leer.nextInt()) {
                case 1:
                    estadoCivil = "Soltero";
                    menu = false;
                    break;
                case 2:
                    estadoCivil = "Casado";
                    menu = false;
                    break;
                case 3:
                    estadoCivil = "Divorciado";
                    menu = false;
                    break;
                case 4:
                    estadoCivil = "Vuido";
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }
        return estadoCivil;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("### Información del estudiante " + id + " - " + nombre + " " + apellido + " ###");
        System.out.println("Estado civil " + estadoCivil);
        System.out.println(">> Está cursando " + curso);
        System.out.println("...");
    }

}
