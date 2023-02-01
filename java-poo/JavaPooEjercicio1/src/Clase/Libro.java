package Clase;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int paginasTotales;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int paginasTotales) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginasTotales = paginasTotales;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginasTotales() {
        return paginasTotales;
    }

    public void setPaginasTotales(int paginasTotales) {
        this.paginasTotales = paginasTotales;
    }

}
