package biblioteca;
// TODo: Documentar la clase

/**
 * Clase que representa la creacion de cada Libro
 * @author Andreea IStrate
 * @version 4.3.2025
 */
public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Titulo es el titulo del Libro
     */
    private String titulo;
    /**
     * Autor es el autro del libro
     */
    private String autor;

    /**
     * anioPublicacion es el año en el que se publico el libro
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor con parametros
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Metodo que devuelve el autor de un Libro
     * @return autro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Metodo que nos devuelve el año de  publicación
     * @return anioPublicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}