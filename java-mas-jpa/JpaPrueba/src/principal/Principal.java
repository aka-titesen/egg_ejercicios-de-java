package principal;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import principal.logica.Alumno;
import principal.logica.Carrera;
import principal.logica.Controladora;
import principal.logica.Materia;

public class Principal {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        //Creamos lista de materias y las agregamos
        LinkedList<Materia> materias = new LinkedList<Materia>();
        //Creación carrera con lista de materias
        Carrera licSisInf = new Carrera();
        licSisInf.setId(1);
        licSisInf.setNombre("Licenciatura de Sistemas de Información");
        licSisInf.setMaterias(materias); //La carrera tiene una lista de materias pero ésta está vacia
        //Guardado Carrera en BD
        control.crearCarrera(licSisInf); //Guardamos la carrera en la BD con la lista de materias vacia, hasta éste punto la carrera no conoce las materias que tiene

        //Creación de materias
        //Crearemos las 3 materias y agruegaremos a cada una la carrera recién creada, de ésta manera ya cada materia conocerá su carrera
        Materia mate1 = new Materia();
        mate1.setId(1);
        mate1.setNombre("Programacion 1");
        mate1.setTipo("Cuatrimestral");
        mate1.setCarrera(licSisInf); //Le asigno a la materia la carrera
        Materia mate2 = new Materia();
        mate2.setId(2);
        mate2.setNombre("Programacion 2");
        mate2.setTipo("Cuatrimestral");
        mate2.setCarrera(licSisInf);//Le asigno a la materia la carrera
        Materia mate3 = new Materia();
        mate3.setId(3);
        mate3.setNombre("Programacion avanzada");
        mate3.setTipo("Anual");
        mate3.setCarrera(licSisInf);//Le asigno a la materia la carrera
        //Guardado Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);

        //Agregar a la lista de materias a la lista que estaba vacia
        materias.add(mate1);
        materias.add(mate2);
        materias.add(mate3);

        //Le pasamos a nivel lógico la lista de materias a la carrera, de ésta manera ya la carrera conoce sus materias
        licSisInf.setMaterias(materias); 
        control.editarCarrera(licSisInf); //Editamos la carrera, ahora ya con sus lista de materias incluidos e impactamos los cambios en la BD

        //Creación Alumno (con carrera)
        Alumno fngz = new Alumno();
        fngz.setId(1);
        fngz.setNombre("Facundo Nicolas");
        fngz.setApellido("Gonzalez");
        fngz.setFechaNac(new Date());
        fngz.setCarrera(licSisInf);

        //Guardamos el alumno en BD
        control.crearAlumno(fngz);
    }

}
