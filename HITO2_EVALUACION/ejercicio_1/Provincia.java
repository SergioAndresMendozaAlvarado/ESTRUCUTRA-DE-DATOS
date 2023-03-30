public class Provincia {
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
