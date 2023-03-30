public class Departamentos {
    private String nombre;
    private int Prov;

    public Departamentos() {
    }
    public Departamentos(String nombre, int Prov) {
        this.nombre = nombre;
        this.Prov = Prov;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre() {
    }
    public int getCantidadProvincias() {
        return Prov;
    }
    public void setCantidadProvincias() {
        this.Prov = Prov;
    }
}
