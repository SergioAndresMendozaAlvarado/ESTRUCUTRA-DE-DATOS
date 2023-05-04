package defensa_pilas_hito3;

public class Main {
    public static void main(String[] args){

        Estudiante est1 = new Estudiante("Sergio","Mendoza",19,"El alto",71,"9908488LP");
        Estudiante est2 = new Estudiante("Jhonatan","Alanoca",22,"El alto",86,"1234567LP");
        Estudiante est3 = new Estudiante("Dylan","Quispe",20,"El alto",50,"4587658LP");
        Estudiante est4 = new Estudiante("Luis","Aguilar",17,"Cochabamba",27,"26154879CB");
        Estudiante est5 = new Estudiante("Marco","Apaza",26,"El alto",69,"3927184LP");

        PilaEstudiante pila = new PilaEstudiante();
        pila.Adicionar(est5);
        pila.Adicionar(est4);
        pila.Adicionar(est3);
        pila.Adicionar(est2);
        pila.Adicionar(est1);




        pila.Mostrar();

        //reprob_aprob(pila);
      //  k_esimo(pila,10);
      //  pila.Mostrar();

        terminacion_CI(pila);
        pila.Mostrar();

    }

    public static void reprob_aprob(PilaEstudiante pila){

        PilaEstudiante aux = new PilaEstudiante();
        Estudiante estEliminado = null;
        int cont = 0;
        int con1 =0;
        //String sCadena = estEliminado.getCI();
        //String sSubCadena = sCadena.substring(7);

        while (!pila.EsVacio()){
            estEliminado = pila.eliminar();

            if(estEliminado.getSede().equals("El alto") && estEliminado.getNotaFinal() >= 51){
              //  estEliminado.getCI().substring()

                cont = cont + 1;

                //System.out.println(sSubCadena);
                // if(sSubCadena == "LP"){
                //    cont = cont + 1;
                //}

                //System.out.println(sSubCadena);
            }
            aux.Adicionar(estEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("Estudiantes con nota mayor a 51: "+cont);
        System.out.println("Estudiantes con terminacion LP "+con1);

    }

    public static void k_esimo(PilaEstudiante pila, int nuevaDireccion){
        PilaEstudiante aux = new PilaEstudiante();
        Estudiante item = null;
        Estudiante nom = null;

        while (!pila.EsVacio()){
            item = pila.eliminar();

            if(pila.nroElem()+1 == nuevaDireccion){
                nom = item;

            } else if (nuevaDireccion>5) {
                System.out.println("Pila Vacia");
            } else {
                aux.Adicionar(item);
            }
           // if(nuevaDireccion >= 5){
           //     System.out.println("Pila vacia");
           // }
        }
        pila.Vaciar(aux);
        pila.Adicionar(nom);
    }
    public static void menor_Nota(PilaEstudiante pila){

        PilaEstudiante aux = new PilaEstudiante();
        Estudiante estEliminado = null;
        int cont = 0;
        int min = Integer.MIN_VALUE;

        while (!pila.EsVacio()){
            estEliminado = pila.eliminar();

            if(estEliminado.getSede().equals("El alto") && estEliminado.getNotaFinal() >= 51){
                cont = cont + 1;
            }
            aux.Adicionar(estEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("Estudiantes con nota mayor a 51: "+cont);
    }

    public static void terminacion_CI(PilaEstudiante pila){
        PilaEstudiante aux = new PilaEstudiante();
        Estudiante item = null;
        Estudiante nom = null;

        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(pila.nroElem()+1 == 2 && item.getSede().equals("El alto")){
                nom = item;
            }else {
                aux.Adicionar(item);
            }
        }
        pila.Vaciar(aux);
        pila.Adicionar(nom);
    }

}
