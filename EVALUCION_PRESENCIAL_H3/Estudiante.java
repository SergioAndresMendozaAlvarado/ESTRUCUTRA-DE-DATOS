package defensa_pilas_hito3;

public class Estudiante {

    private String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private  int notaFinal;
    private String CI;

    public Estudiante(String nombres, String apellidos, int edad, String sede, int notaFinal, String CI) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.CI = CI;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void motrarEstudiante(){
        System.out.println("\nMostrando datos del estudiante: ");
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Apellido: "+this.apellidos);
        System.out.println("Edad: "+this.edad);
        System.out.println("Sede: "+this.sede);
        System.out.println("CI: "+this.CI);
    }

}
