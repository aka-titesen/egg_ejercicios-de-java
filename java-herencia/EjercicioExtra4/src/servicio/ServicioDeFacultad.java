package servicio;

import entidad.Estudiante;
import entidad.PersonalDeServicio;
import entidad.Profesor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioDeFacultad {

    private Scanner leer;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    private List<PersonalDeServicio> personalDeServicios;

    public ServicioDeFacultad() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.estudiantes = new ArrayList();
        this.profesores = new ArrayList();
        this.personalDeServicios = new ArrayList();
    }

    public Estudiante crearEstudiante() {
        Estudiante e1 = new Estudiante();
        System.out.print("---> Ingresa el curso: ");
        e1.setCurso(leer.next());
        System.out.print("---> Ingresa el nombre: ");
        e1.setNombre(leer.next());
        System.out.print("---> Ingresa el apellido: ");
        e1.setApellido(leer.next());
        e1.setEstadoCivil(e1.estadoCivil()); //Estado civil
        return e1;

    }

    public Profesor crearProfesor() {
        Profesor p1 = new Profesor();
        System.out.print("---> Ingresa la materia que imparte: ");
        p1.setMateria(leer.next());
        System.out.print("---> Ingresa el año de incorporación: ");
        int anho = leer.nextInt();
        LocalDate anhoIncorporacion = LocalDate.of(anho, 1, 1);
        p1.setAnhoIncorporacion(anhoIncorporacion); //Asigna un año
        System.out.print("---> Ingresa el despacho: ");
        p1.setDespacho(leer.nextInt());
        System.out.print("---> Ingresa el nombre: ");
        p1.setNombre(leer.next());
        System.out.print("---> Ingresa el apellido: ");
        p1.setApellido(leer.next());
        p1.setEstadoCivil(p1.estadoCivil()); //Establece el estado civil
        return p1;

    }

    public PersonalDeServicio crearPersonalDeServicio() {
        PersonalDeServicio pds1 = new PersonalDeServicio();
        System.out.print("---> Ingresa la sección: ");
        pds1.setSeccion(leer.next());
        System.out.print("---> Ingresa el año de incorporación: ");
        int anho = leer.nextInt();
        LocalDate anhoIncorporacion = LocalDate.of(anho, 1, 1);
        pds1.setAnhoIncorporacion(anhoIncorporacion);
        System.out.print("---> Ingresa el despacho: ");
        pds1.setDespacho(leer.nextInt());
        System.out.print("---> Ingresa el nombre: ");
        pds1.setNombre(leer.next());
        System.out.print("---> Ingresa el apellido: ");
        pds1.setApellido(leer.next());
        pds1.setEstadoCivil(pds1.estadoCivil());
        return pds1;
    }

    public void tipoDePersonal() {
        boolean menu = true;
        System.out.println("### Seleccione el personal a registrar ###");

        while (menu) {
            System.out.println(">> 1: Estudiante | 2: Profesor | 3: Personal de Servicio | 4: Salir");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    estudiantes.add(crearEstudiante());
                    break;
                case 2:
                    profesores.add(crearProfesor());
                    break;
                case 3:
                    personalDeServicios.add(crearPersonalDeServicio());
                    break;
                case 4:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }

        }

    }

    public void menu() {
        boolean menu = true;
        System.out.println("### Seleccione que desea operar ###");
        while (menu) {
            System.out.println(">> 1: Ingresar un nuevo registro | 2: Ver todo el registro del personal | 3: Cambiar valores | 4: Salir ");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1: //Creo un nuevo Registro
                    tipoDePersonal();
                    break;
                case 2: //Ver todo el todo registro por categorías
                    System.out.println("\n ### Profesores ###"); //Profesores
                    for (Profesor profesor : profesores) {
                        profesor.mostrarInformacion();
                    }
                    System.out.println("\n ### Estudiantes ###"); //Estudiantes
                    for (Estudiante estudiante : estudiantes) {
                        estudiante.mostrarInformacion();
                    }
                    System.out.println("\n ### Personal de servicio ###"); //Personal de servicio
                    for (PersonalDeServicio personalDeServicio : personalDeServicios) {
                        personalDeServicio.mostrarInformacion();
                    }
                    break;
                case 3:
                    menuCambiarInformacion();
                    break;
                case 4:
                    menu = false;
                    System.out.println(">> Ha salido del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }
    }

    public void menuCambiarInformacion() {
        boolean menu = true;
        System.out.println("### Cambiar informacion del personal ###");
        while (menu) {
            System.out.println(">> 1: Estudiantes | 2: Profesores | 3: Personal de Servicio | 4: Salir");
            System.out.print("---> Seleccione: ");
            switch (leer.nextInt()) {
                case 1:
                    cambiarInformacionTipoPersonal(1);
                    break;
                case 2:
                    cambiarInformacionTipoPersonal(2);
                    break;
                case 3:
                    cambiarInformacionTipoPersonal(3);
                    break;
                case 4:
                    System.out.println(">> Ha salido de la sección");
                    menu = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a elegir");
                    break;
            }
        }
    } //Por terminar

    public void cambiarInformacionTipoPersonal(int tipoPersonal) { //Comienzo del método
        boolean menu = true;
        int seleccion = 0;
        while (menu) { //Comienzo del While exterior
            boolean subMenu = true;
            switch (tipoPersonal) { //Comienzo Switch exterior
                case 1: //Estudiantes 
                    while (subMenu) { //Comienzo While interno
                        System.out.println(">> 1: Cambia el estado civil | 2: Cambia el curso | 3: Salir");
                        System.out.print("---> Seleccione: ");
                        switch (leer.nextInt()) { //Comienzo Switch interno
                            case 1:
                                System.out.print("---> Ingrese el Id del estudiante: ");
                                seleccion = leer.nextInt() - 1;
                                while (seleccion > estudiantes.size()) {
                                    System.out.println(">> No hay un estudiante con ese id ");
                                    System.out.print("---> Ingrese el Id del estudiante: ");
                                    seleccion = leer.nextInt() - 1;
                                }
                                for (int i = 0; i < estudiantes.size(); i++) {
                                    if (i == seleccion) {
                                        estudiantes.get(i).setEstadoCivil(estudiantes.get(i).estadoCivil()); //Cambio el estado civil
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("---> Ingrese el Id del estudiante: ");
                                seleccion = leer.nextInt() - 1;
                                while (seleccion > estudiantes.size()) {
                                    System.out.println(">> No hay un estudiante con ese id ");
                                    System.out.print("---> Ingrese el Id del estudiante: ");
                                    seleccion = leer.nextInt() - 1;
                                }
                                for (int i = 0; i < estudiantes.size(); i++) {
                                    if (i == seleccion) {
                                        System.out.println(">> Ingrese el nuevo curso: ");
                                        estudiantes.get(i).setCurso(leer.next()); //Cambio el curso
                                    }
                                }
                                break;
                            case 3:
                                subMenu = false;
                                System.out.println(">> Ha salido de ésta sección");
                                break;

                        }//Final Switch interno
                    }//Final While interno
                    menu = false;
                case 2: //Profesores
                    while (subMenu) {
                        System.out.println(">> 1: Cambia despacho | 2: Cambia de materia | 3: Salir");
                        System.out.println("---> Seleccione: ");
                        switch (leer.nextInt()) {
                            case 1:
                                System.out.print("---> Ingrese el Id del profesor: ");
                                seleccion = leer.nextInt() - 1;
                                while (seleccion > profesores.size()) {
                                    System.out.println(">> No hay un profesor con ese id ");
                                    System.out.print("---> Ingrese el Id del profesor: ");
                                    seleccion = leer.nextInt() - 1;
                                }
                                for (int i = 0; i < profesores.size(); i++) {
                                    if (i == seleccion) {
                                        System.out.print("---> Ingresa el nuevo despacho");
                                        profesores.get(i).setDespacho(leer.nextInt());
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("---> Ingrese el Id del profesor: ");
                                seleccion = leer.nextInt() - 1;
                                while (seleccion > profesores.size()) {
                                    System.out.println(">> No hay un profesor con ese id ");
                                    System.out.print("---> Ingrese el Id del profesor: ");
                                    seleccion = leer.nextInt() - 1;
                                }
                                for (int i = 0; i < profesores.size(); i++) {
                                    if (i == seleccion) {
                                        System.out.print("---> Ingresa la nueva materia");
                                        profesores.get(i).setMateria(leer.next()); //Cambia de materia
                                    }
                                }
                                break;
                            case 3:
                                subMenu = false;
                                System.out.println(">> Ha salido de ésta sección");
                                break;
                        }
                    }
                    menu = false;
                    break;
                case 3: //Personal de servicio
                    while (subMenu) {
                        System.out.println(">> 1: Cambia de sección | 2: Salir");
                        System.out.print("---> Seleccione");
                        switch (leer.nextInt()) {
                            case 1:
                                System.out.print("---> Ingrese el Id del personal de servicio: ");
                                seleccion = leer.nextInt() - 1;
                                while (seleccion > personalDeServicios.size()) {
                                    System.out.println(">> No hay un personal de servicior con ese id ");
                                    System.out.print("---> Ingrese el Id del personal de servicio: ");
                                    seleccion = leer.nextInt() - 1;
                                }
                                for (int i = 0; i < personalDeServicios.size(); i++) {
                                    if (i == seleccion) {
                                        System.out.print("---> Ingresa la nueva materia");
                                        personalDeServicios.get(i).setSeccion(leer.next()); //Cambia de sección
                                    }
                                }
                                break;
                            case 2:
                                System.out.println(">> Ha salido de ésta sección");
                                subMenu = false;
                                break;
                        }
                    }
                    menu = false;
                    break;
            } //Final Switch exterior
        } //Comienzo del While exterior
    }//Final del método
}
