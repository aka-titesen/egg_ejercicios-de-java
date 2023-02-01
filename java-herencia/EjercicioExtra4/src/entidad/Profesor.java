package entidad;

import java.time.LocalDate;
import java.util.Scanner;

public class Profesor extends Empleado {

    private String materia;
    private static int contadorProfesor;

    public Profesor() {
        if (contadorProfesor == 0) {
            contadorProfesor = 1;
        }
        this.id = contadorProfesor++;
    }

    public Profesor(String materia, LocalDate anhoIncorporacion, int despacho) {
        super(anhoIncorporacion, despacho);
        this.materia = materia;
        if (contadorProfesor == 0) {
            contadorProfesor = 1;
        }
        this.id = contadorProfesor++;
    }

    public Profesor(String materia, LocalDate anhoIncorporacion, int despacho, String nombre, String apellido, String estadoCivil) {
        super(anhoIncorporacion, despacho, nombre, apellido, estadoCivil);
        this.materia = materia;
        if (contadorProfesor == 0) {
            contadorProfesor = 1;
        }
        this.id = contadorProfesor++;
    }

    public Profesor(String materia) {
        this.materia = materia;
        if (contadorProfesor == 0) {
            contadorProfesor = 1;
        }
        this.id = contadorProfesor++;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public static int getContadorProfesor() {
        return contadorProfesor;
    }

    public static void setContadorProfesor(int contadorProfesor) {
        Profesor.contadorProfesor = contadorProfesor;
    }

    public LocalDate getAnhoIncorporacion() {
        return anhoIncorporacion;
    }

    public void setAnhoIncorporacion(LocalDate anhoIncorporacion) {
        this.anhoIncorporacion = anhoIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
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
        System.out.println("### Información del profesor " + id + " - " + nombre + " " + apellido + " ###");
        System.out.println("Estado civil " + estadoCivil);
        System.out.println(">> Está impartiendo " + materia);
        System.out.println(">> Año de incorporación " + anhoIncorporacion.getYear());
        System.out.println(">> Despacho " + despacho);
        System.out.println("...");
    }

}
