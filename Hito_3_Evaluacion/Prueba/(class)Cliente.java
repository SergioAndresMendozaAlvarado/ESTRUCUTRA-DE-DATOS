public class Cliente {

    private String nombres;
    private String apellidos;
    private int edad;
    private String direccion;
    private String genero;

    public Cliente(String nombres, String apellidos, int edad, String direccion, String genero){

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void motrarCliente(){

        System.out.println("\nMostrando datos del Cliente");
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Apellidos: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Genero: "+this.genero);

    }
}
