class Main{
    public static void main(String[] args){

        Provincia prov = new Provincia();
        prov.datos_prov("Bolivar", "A lado de SANTIGAO",232);

        System.out.println("La provincia es: " +prov.getNombre_prov());
        System.out.println("La ubicacion es: "+prov.getUbicaion());
        System.out.println("La poblacion es de: "+prov.getPoblacion()+" Personas");

    }
}
