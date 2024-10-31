public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
        this.titulo = "Título desconocido";
        this.autor = "Autor desconocido";
        this.numeroPaginas = 0;
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de páginas: " + numeroPaginas;
    }
}
