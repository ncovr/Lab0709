public class Libro {
    private String titulo;
    private Autor autor;

    // constructor
    public Libro(String titulo){
        this.titulo = titulo;
    }

    public static void add(Libro libro) {
    }

    public String getAutor(){ return this.autor.toString(); }
    public String getTitulo(){ return this.titulo; }

}
