package Clase;

public class CadenaDeTexto {

    private String palabra;
    private int longitudDeLaPalabra;
    private String[] vectorCadena;

    public CadenaDeTexto() {
    }

    public CadenaDeTexto(String palabra, int longitudDeLaPalabra, String[] vectorCadena) {
        this.palabra = palabra;
        this.longitudDeLaPalabra = longitudDeLaPalabra;
        this.vectorCadena = vectorCadena;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLongitudDeLaPalabra() {
        return longitudDeLaPalabra;
    }

    public void setLongitudDeLaPalabra(int longitudDeLaPalabra) {
        this.longitudDeLaPalabra = longitudDeLaPalabra;
    }

    public String[] getVectorCadena() {
        return vectorCadena;
    }

    public void setVectorCadena(String[] vectorCadena) {
        this.vectorCadena = vectorCadena;
    }
}
