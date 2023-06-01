package H4_COLAS.objetos;

public class Libros {

    private int cod_Libro;
    private String autor;
    private String genero;
    private String categoria;
    private int paginas;

    public Libros(int cod_Libro, String autor, String genero, String categoria, int paginas) {

        this.cod_Libro = cod_Libro;
        this.autor = autor;
        this.genero = genero;
        this.categoria = categoria;
        this.paginas = paginas;

    }

    public int getCod_Libro() {
        return cod_Libro;
    }

    public void setCod_Libro(int cod_Libro) {
        this.cod_Libro = cod_Libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrar(){

        System.out.println("Mostrando datos del libro: ");
        System.out.println("Codigo: " + getCod_Libro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Paginas: " + getPaginas());
        System.out.println();

    }

}
