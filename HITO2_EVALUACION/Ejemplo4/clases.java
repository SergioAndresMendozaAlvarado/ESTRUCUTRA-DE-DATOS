class  Pais{
    public  String datos;
    public int poblacion;
    public double altura_max;
    String bol;
    public Pais(){ //Constructor

    }
    public void pais_nom(){
        bol = "Bolivia";
    }

    public String getBol() {
        return bol;
    }

    public void setBol(String bol) {
        this.bol = bol;
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
class Provincia {
    String Nombre_prov;
    String Ubicaion;
    int poblacion;

    public Provincia(){

    }

    public void datos_prov(String Nombre_prov,String Ubicaion, int poblacion){
        this.Nombre_prov = Nombre_prov;
        this.Ubicaion = Ubicaion;
        this.poblacion = poblacion;

    }
    public void setNombre_prov(String nombre_prov) {
        this.Nombre_prov = nombre_prov;
    }
    public String getNombre_prov() {
        return Nombre_prov;
    }
    public String getUbicaion() {
        return Ubicaion;
    }
    public void setUbicaion(String ubicaion) {
        this.Ubicaion = ubicaion;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

}
