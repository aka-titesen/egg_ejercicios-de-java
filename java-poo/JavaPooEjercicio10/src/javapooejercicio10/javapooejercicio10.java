package javapooejercicio10;

import Clase.Vector;
import Servicio.ServicioDeVector;

public class javapooejercicio10 {

    public static void main(String[] args) {
        ServicioDeVector sdv = new ServicioDeVector();
        Vector v1 = sdv.crearVector();
        double[] vectorA = sdv.vectorA(v1);
        System.out.println("========= VectorA desordenado =========");
        sdv.imprimirVector(vectorA);
        System.out.println("");
        //VectorA ordenado
        sdv.mayorAMenor(vectorA);
        v1.setVectorA(vectorA);
        System.out.println("========= VectorA ordenado =========");
        sdv.imprimirVector(vectorA);
        System.out.println("");
        double[] vectorB = sdv.vectorB(v1);
        System.out.println("========= VectorB =========");
        sdv.imprimirVector(vectorB);
        System.out.println("");
    }

}
