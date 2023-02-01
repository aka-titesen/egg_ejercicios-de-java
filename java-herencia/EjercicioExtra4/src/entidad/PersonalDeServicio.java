package entidad;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonalDeServicio extends Empleado {

    private String seccion;
    private static int contadorPersonalDeServicio;

    public PersonalDeServicio() {
        if (contadorPersonalDeServicio == 0) {
            contadorPersonalDeServicio = 1;
        }
        this.id = contadorPersonalDeServicio++;
    }

    public PersonalDeServicio(String seccion, LocalDate anhoIncorporacion, int despacho) {
        super(anhoIncorporacion, despacho);
        this.seccion = seccion;
        if (contadorPersonalDeServicio == 0) {
            contadorPersonalDeServicio = 1;
        }
        this.id = contadorPersonalDeServicio++;
    }

    public PersonalDeServicio(String seccion, LocalDate anhoIncorporacion, int despacho, String nombre, String apellido, String estadoCivil) {
        super(anhoIncorporacion, despacho, nombre, apellido, estadoCivil);
        this.seccion = seccion;
        if (contadorPersonalDeServicio == 0) {
            contadorPersonalDeServicio = 1;
        }
        this.id = contadorPersonalDeServicio++;
    }

    public PersonalDeServicio(String seccion) {
        this.seccion = seccion;
        if (contadorPersonalDeServicio == 0) {
            contadorPersonalDeServicio = 1;
        }
        this.id = contadorPersonalDeServicio++;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public static int getContadorPersonalDeServicio() {
        return contadorPersonalDeServicio;
    }

    public static void setContadorPersonalDeServicio(int contadorPersonalDeServicio) {
        PersonalDeServicio.contadorPersonalDeServicio = contadorPersonalDeServicio;
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
        System.out.println("### Información del personal de servicio " + id + " - " + nombre + " " + apellido + " ###");
        System.out.println("Estado civil " + estadoCivil);
        System.out.println(">> Está trabajando  en " + seccion);
        System.out.println(">> Año de incorporación " + anhoIncorporacion.getYear());
        System.out.println(">> Despacho " + despacho);
        System.out.println("...");
    }

}
