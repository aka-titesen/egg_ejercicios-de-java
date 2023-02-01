package entidad;

public class Adivinanza {

    private int numeroSecreto;
    private int numeroAAdivinar;
    private int intentos;

    public Adivinanza() {
    }

    public Adivinanza(int numeroSecreto, int numeroAAdivinar, int intentos) {
        this.numeroSecreto = numeroSecreto;
        this.numeroAAdivinar = numeroAAdivinar;
        this.intentos = intentos;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public void setNumeroSecreto(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
    }

    public int getNumeroAAdivinar() {
        return numeroAAdivinar;
    }

    public void setNumeroAAdivinar(int numeroAAdivinar) {
        this.numeroAAdivinar = numeroAAdivinar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
