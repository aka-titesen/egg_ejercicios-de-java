package entidad;

public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private boolean propulsorL;
    private boolean propulsorR;
    private boolean repulsorL;
    private boolean repulsorR;
    private long resistencia;
    private long salud;
    private long bateria; //También podría decirse reactor
    private String consola; //Solo escribirá por pantalla a Tony
    private String sintetizador; //Lo mismo que consola pero con audio

    //Constructores
    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, boolean propulsorL, boolean propulsorR, boolean repulsorL, boolean repulsorR, long resistencia, long salud, long bateria, String consola, String sintetizador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.propulsorL = propulsorL;
        this.propulsorR = propulsorR;
        this.repulsorL = repulsorL;
        this.repulsorR = repulsorR;
        this.resistencia = resistencia;
        this.salud = salud;
        this.bateria = bateria;
        this.consola = consola;
        this.sintetizador = sintetizador;
    }
    //Getters y setters

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public boolean isPropulsorL() {
        return propulsorL;
    }

    public void setPropulsorL(boolean propulsorL) {
        this.propulsorL = propulsorL;
    }

    public boolean isPropulsorR() {
        return propulsorR;
    }

    public void setPropulsorR(boolean propulsorR) {
        this.propulsorR = propulsorR;
    }

    public boolean isRepulsorL() {
        return repulsorL;
    }

    public void setRepulsorL(boolean repulsorL) {
        this.repulsorL = repulsorL;
    }

    public boolean isRepulsorR() {
        return repulsorR;
    }

    public void setRepulsorR(boolean repulsorR) {
        this.repulsorR = repulsorR;
    }

    public long getResistencia() {
        return resistencia;
    }

    public void setResistencia(long resistencia) {
        this.resistencia = resistencia;
    }

    public long getSalud() {
        return salud;
    }

    public void setSalud(long salud) {
        this.salud = salud;
    }

    public long getBateria() {
        return bateria;
    }

    public void setBateria(long bateria) {
        this.bateria = bateria;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(String sintetizador) {
        this.sintetizador = sintetizador;
    }

    //Métodos propios
    public void escribirConsola() {
        System.out.println("");
        System.out.println(">> " + consola + " <<");
        System.out.println("");
    }

    public void leerConsola(String txt) {
        consola = txt;
    }

    public void caminar(int intensidad, int duracion) {
        int consumo = (intensidad * 2) * duracion;
        bateria -= consumo;
    }

}
