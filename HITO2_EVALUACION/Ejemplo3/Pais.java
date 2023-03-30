class  Pais{
    public  String datos;
    public int poblacion;
    public double altura_max;
    public Pais(){ //Constructor

    }

    public void Motrar_datos_pais(String datos, int poblacion, double altura_max){
        this.datos = datos; this.poblacion = poblacion; this.altura_max = altura_max;
    }

    public double getAltura_max() {
        return altura_max;
    }

    public void setAltura_max(double altura_max) {
        this.altura_max = altura_max;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
}
public class Departamentos {
    public String nombre;
    public int Prov;

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
