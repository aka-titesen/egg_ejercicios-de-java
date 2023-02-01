package entidad;

public class DivisionNumero {

    private String numA;
    private String numB;
    private double resultado;

    public DivisionNumero() {
    }

    public DivisionNumero(String numA, String numB, double resultado) {
        this.numA = numA;
        this.numB = numB;
        this.resultado = resultado;
    }

    public String getNumA() {
        return numA;
    }

    public void setNumA(String numA) {
        this.numA = numA;
    }

    public String getNumB() {
        return numB;
    }

    public void setNumB(String numB) {
        this.numB = numB;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
