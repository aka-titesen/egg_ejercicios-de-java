package interfaz;

public interface Rueda {

    public double maximaPresion = 2.5; //Atributo que fija la cantidad de presión de aire que soporta un neumatico 

    abstract void avanzar();

    abstract void detenerse();

}
