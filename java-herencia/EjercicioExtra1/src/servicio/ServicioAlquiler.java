package servicio;

import entidad.Alquiler;
import entidad.Amotor;
import entidad.Velero;
import entidad.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlquiler {

    private List<Alquiler> registrosAlquiler;
    private Scanner leer;

    public ServicioAlquiler() {
        this.registrosAlquiler = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public List<Alquiler> getRegistrosAlquiler() {
        return registrosAlquiler;
    }

    public void setRegistrosAlquiler(List<Alquiler> registrosAlquiler) {
        this.registrosAlquiler = registrosAlquiler;
    }

    public Amotor crearAmotor() {
        Amotor a1 = new Amotor();
        System.out.print("---> Ingrese el nombre del cliente: ");
        a1.setNombreCliente(leer.next());
        System.out.print("---> Ingrese el DNI del cliente: ");
        a1.setDniCliente(leer.nextInt());
        System.out.println(">> La fecha de alquiler se configuró para la fecha actual");
        LocalDate fechaAlquiler = LocalDate.now();
        a1.setFechaAlquiler(fechaAlquiler);
        System.out.println(">> Ingrese la fecha de devolución");
        System.out.print("---> Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("---> Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("---> Ingrese el año: ");
        int anho = leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anho, mes, dia);
        a1.setFechaDevolucion(fechaDevolucion);
        System.out.print("---> Ingrese la posición de amarre: ");
        a1.setPosicionAmarre(leer.nextInt());
        System.out.print("---> Ingrese la matricula: ");
        a1.setMatricula(leer.next());
        System.out.print("---> Ingrese el eslora: ");
        a1.setEslora(leer.nextInt());
        System.out.print("---> Ingrese el año de fabricación: ");
        int anho_dos = leer.nextInt();
        LocalDate anhoFabricacion = LocalDate.of(anho_dos, 1, 1);
        a1.setAnhoFabricacion(anhoFabricacion);
        System.out.print("---> Ingrese la potencia en caballos");
        a1.setCv(leer.nextInt());
        a1.setPrecio(a1.precioBase()); //Llamo al método sobreescrito que me devuelve el precio y lo establece en el atributo precio
        return a1;
    }

    public Velero crearVelero() { //Lo mismo que el anterior pero en Velero
        Velero v1 = new Velero();
        System.out.print("---> Ingrese el nombre del cliente: ");
        v1.setNombreCliente(leer.next());
        System.out.print("---> Ingrese el DNI del cliente: ");
        v1.setDniCliente(leer.nextInt());
        System.out.println(">> La fecha de alquiler se configuró para la fecha actual");
        LocalDate fechaAlquiler = LocalDate.now();
        v1.setFechaAlquiler(fechaAlquiler);
        System.out.println(">> Ingrese la fecha de devolución");
        System.out.print("---> Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("---> Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("---> Ingrese el año: ");
        int anho = leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anho, mes, dia);
        v1.setFechaDevolucion(fechaDevolucion);
        System.out.print("---> Ingrese la posición de amarre: ");
        v1.setPosicionAmarre(leer.nextInt());
        System.out.print("---> Ingrese la matricula: ");
        v1.setMatricula(leer.next());
        System.out.print("---> Ingrese el eslora: ");
        v1.setEslora(leer.nextInt());
        System.out.print("---> Ingrese el año de fabricación: ");
        int anho_dos = leer.nextInt();
        LocalDate anhoFabricacion = LocalDate.of(anho_dos, 1, 1);
        v1.setAnhoFabricacion(anhoFabricacion);
        System.out.print("---> Ingrese el número de mastiles: ");
        v1.setMastiles(leer.nextInt());
        v1.setPrecio(v1.precioBase());
        return v1;
    }

    public Yate crearYate() {
        Yate y1 = new Yate();
        System.out.print("---> Ingrese el nombre del cliente: ");
        y1.setNombreCliente(leer.next());
        System.out.print("---> Ingrese el DNI del cliente: ");
        y1.setDniCliente(leer.nextInt());
        System.out.println(">> La fecha de alquiler se configuró para la fecha actual");
        LocalDate fechaAlquiler = LocalDate.now();
        y1.setFechaAlquiler(fechaAlquiler);
        System.out.println(">> Ingrese la fecha de devolución");
        System.out.print("---> Ingrese el día: ");
        int dia = leer.nextInt();
        System.out.print("---> Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.print("---> Ingrese el año: ");
        int anho = leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anho, mes, dia);
        y1.setFechaDevolucion(fechaDevolucion);
        System.out.print("---> Ingrese la posición de amarre: ");
        y1.setPosicionAmarre(leer.nextInt());
        System.out.print("---> Ingrese la matricula: ");
        y1.setMatricula(leer.next());
        System.out.print("---> Ingrese el eslora: ");
        y1.setEslora(leer.nextInt());
        System.out.print("---> Ingrese el año de fabricación: ");
        int anho_dos = leer.nextInt();
        LocalDate anhoFabricacion = LocalDate.of(anho_dos, 1, 1);
        y1.setAnhoFabricacion(anhoFabricacion);
        System.out.print("---> Ingrese la potencia en caballos: ");
        y1.setCv(leer.nextInt());
        System.out.print("---> Ingrese el número de camarotes: ");
        y1.setCamarotes(leer.nextInt());
        y1.setPrecio(y1.precioBase());
        return y1;
    }

    public void seleccionarTipoBarco(int tipoDeBarco) { //Crerá un barco y lo guardará en el registro
        switch (tipoDeBarco) {
            case 1:
                registrosAlquiler.add(crearVelero());
                break;
            case 2:
                registrosAlquiler.add(crearAmotor());
                break;
            case 3:
                registrosAlquiler.add(crearYate());
                break;
        }
    }

    public void menu() {
        System.out.println(">> Selecciona que desea hacer ");
        boolean menu = true;
        int seleccion = 0;
        while (menu) {
            System.out.println("1: Crea un nuevo registro de alquiler, 2: Ve todo el registro de alquileres, 3: Salir");
            System.out.print("---> Seleccionar: ");
            switch (leer.nextInt()) {
                case 1: //Permite elegir un barco
                    System.out.println(">> Selecciona el tipo de barco");
                    System.out.println("1: Velero, 2: Amotor, 3: Yate");
                    System.out.print("---> Seleccionar: ");
                    seleccion = leer.nextInt();
                    while (seleccion != 1 && seleccion != 2 && seleccion != 3) {
                        System.out.println("Vuelva seleccionar, una opción");
                        System.out.println("1: Velero, 2: Amotor, 3: Yate");
                        System.out.print("---> Seleccionar: ");
                        seleccion = leer.nextInt();
                    }
                    seleccionarTipoBarco(seleccion);
                    break;
                case 2: //Mostrar los registros de los barcos que voy agregando
                    for (Alquiler alquiler : registrosAlquiler) {
                        alquiler.mostrarInformacion();
                    }
                    break;
                case 3: //Salir del programa
                    menu = false;
                    System.out.println(">> Ha salido del programa");
                    break;
                default:
                    System.out.println(">> Opción incorrecta, vuelve al menú");
                    break;
            }
        }
    }

}
