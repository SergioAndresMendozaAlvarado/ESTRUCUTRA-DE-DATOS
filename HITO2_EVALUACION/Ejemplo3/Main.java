class Main{
    public static void main(String[] args){

        Pais pa = new Pais(); //Instanciando Pais
        pa.Motrar_datos_pais("Bolivia",14634233,3623.45);

        System.out.println("El nombres del pais es: "+pa.getDatos());

        System.out.println("La poblacion total es: "+pa.getPoblacion());

        System.out.println("La altira maxima es: "+pa.getAltura_max());
        System.out.println();
        System.out.println("Los departamentos son:");
        System.out.println();


        //UN ARRAY CON LOS VALORES DE CADA DEPARTAMENTOS
        String[] dep_Boli = {"La Paz",
                "Oruro",
                "Cbb",
                "Santa Cruz",
                "Pando",
                "Chuquisaca",
                "Tarija",
                "Beni",
                "Potosi"};
        //arraya con la cantidad de provincias por departamento (datos inventados)
        int[] Prov_por_depa = {36, 61, 12, 32, 24, 12, 26, 48, 19};


        //Creacion del array
        Departamentos[] departamentos = new Departamentos[dep_Boli.length];


        //Recorriendo las posiciones
        for (int i = 0; i < dep_Boli.length; i++) {
            departamentos[i] = new Departamentos(dep_Boli[i], Prov_por_depa[i]);
        }

        for (Departamentos departamento : departamentos) {
            System.out.println("Nombre Departamento: " + departamento.getNombre() + ", Provincias: " + departamento.getCantidadProvincias());
        }

    }
}
