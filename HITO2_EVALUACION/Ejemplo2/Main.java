class Main{
    public static void main(String[] args){


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
            System.out.println("Nombre Departamento: " + departamento.getNombre() + ", Provincias en total: " + departamento.getCantidadProvincias());
        }

    }
}
