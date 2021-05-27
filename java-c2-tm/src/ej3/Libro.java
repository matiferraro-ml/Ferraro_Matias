package ej3;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;

    private String estado;

    public Libro() { }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Libro(Libro unLibro) {
        this.titulo = unLibro.getTitulo();
        this.isbn = unLibro.getIsbn();
        this.autor = unLibro.getAutor();
    }

    public void prestamo() {
        setEstado("Prestado");
    }

    public void devolucion() {
        setEstado("Disponible");
    }

    @Override
    public String toString() {
        String str = getTitulo() + ", " + getIsbn() + ", " + getAutor();
        return str;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
