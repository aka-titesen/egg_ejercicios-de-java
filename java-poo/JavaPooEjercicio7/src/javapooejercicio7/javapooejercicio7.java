package javapooejercicio7;

import Clase.Persona;
import Servicio.ServicioDePersona;

public class javapooejercicio7 {

    public static void main(String[] args) {
        ServicioDePersona sdp = new ServicioDePersona();
        Persona persona1 = sdp.crearPersona();
        Persona persona2 = sdp.crearPersona();
        Persona persona3 = sdp.crearPersona();
        Persona persona4 = sdp.crearPersona();
        //IMC
        double imc1persona1 = sdp.calcularIMC(persona1);
        System.out.println(imc1persona1);
        double imc2persona2 = sdp.calcularIMC(persona2);
        System.out.println(imc2persona2);
        double imc3persona3 = sdp.calcularIMC(persona3);
        System.out.println(imc3persona3);
        double imc4persona4 = sdp.calcularIMC(persona4);
        System.out.println(imc4persona4);
        //Mayor de edad
        boolean edad1persona1 = sdp.mayorDeEdad(persona1);
        boolean edad2persona2 = sdp.mayorDeEdad(persona2);
        boolean edad3persona3 = sdp.mayorDeEdad(persona3);
        boolean edad4persona4 = sdp.mayorDeEdad(persona4);
        //Porcentaje del IMC
        System.out.println("");
        sdp.calcularIMCPorcentaje(imc1persona1, imc2persona2, imc3persona3, imc4persona4);

        //Porcentaje de la edad
        System.out.println("");
        sdp.calcularEdadPorcentaje(edad1persona1, edad2persona2, edad3persona3, edad4persona4);

        System.out.println("");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());
    }

}
