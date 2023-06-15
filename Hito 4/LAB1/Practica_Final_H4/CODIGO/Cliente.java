package ColaClientes;

public class Cliente {

    private String nombre;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public Cliente(String nombre, String apellidos, int edad, String pais, String genero, String tipo){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;

    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
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

    public String getPais() {

        return pais;
    }

    public void setPais(String pais) {

        this.pais = pais;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public void muetraCliente(){

        System.out.println();
        System.out.println("Mostrando datos del cliente: ");

        System.out.println("Nombres: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("Pais: "+getPais());
        System.out.println("Genero: " +getGenero());
        System.out.println("Tipo: "+getTipo());

    }

}
