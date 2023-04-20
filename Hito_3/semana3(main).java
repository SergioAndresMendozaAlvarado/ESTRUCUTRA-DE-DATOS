package PILAS;

public class Main_cadenas{
    public static void main(String[] args)
    {
        PilaDeCadenas pilaC = new PilaDeCadenas();
        pilaC.Adicionar("William");
        pilaC.Adicionar("Andres");
        pilaC.Adicionar("Josias");
        pilaC.Adicionar("Iris");
        pilaC.Adicionar("Jonathan");
        pilaC.Adicionar("Ilia");
//      pilaC.Mostrar();
//control + /

        //comenta todas las lineas
       // pilaC.llenar(6);
//        pilaC.Mostrar();
//        andres_count(pilaC,"Andres");

//        Anna_jos_and(pilaC,"Josias");
//        pilaC.Mostrar();
       // pilaC.Mostrar();
       // cambioDePosicionCadenas(pilaC);
       // pilaC.Mostrar();
        pilaC.Mostrar();
        elemto_3_al_1(pilaC,"Iris");
        pilaC.Mostrar();
        elemto_3_al_1(pilaC,"Ilia");
        pilaC.Mostrar();

    }
    public static void andres_count(PilaDeCadenas pila, String nombre){

        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        int cont = 0;

        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();

            if(itemEliminado.equals(nombre)){ //.equals() funciona como un == en el if, es mejror para cadenas
                cont = cont + 1;
            }
            aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
        System.out.println("El nombre "+nombre+ " Se repite "+cont+" Veces");

        }
        //crear metdo estatica y que netre josia y andres este en nombre ANNA
        public static void Anna_jos_and(PilaDeCadenas pila, String nom_reciv){

            PilaDeCadenas aux = new PilaDeCadenas();
            String itemEliminado = "";
            int cont = 0;

            while (!pila.EsVacio()){
                itemEliminado = pila.eliminar();

                if(itemEliminado == nom_reciv && nom_reciv == "Josias"){
                    System.out.println();
                    pila.Adicionar("ANNA");
                }
                aux.Adicionar(itemEliminado);
            }
            pila.Vaciar(aux);

        }

    public static void cambioDePosicionCadenas(PilaDeCadenas pila){

        PilaDeCadenas aux = new PilaDeCadenas();
        String item1 = pila.eliminar(); //Ilia
        aux.Vaciar(pila);
        String item2 = aux.eliminar();//William
        pila.Adicionar(item1);
        pila.Vaciar(aux);
        pila.Adicionar(item2);
    }

    public static void elemto_3_al_1(PilaDeCadenas pila,String nom_a_mover){

        PilaDeCadenas aux = new PilaDeCadenas();
        String itemEliminado = "";
        String josias = "Josias";


        while (!pila.EsVacio()){
            itemEliminado = pila.eliminar();

            if(itemEliminado == nom_a_mover && nom_a_mover == "Iris"){
                System.out.println();
                String ilia = pila.eliminar();
                josias = itemEliminado;
            }else {
                aux.Adicionar(itemEliminado);
            }

//            if(itemEliminado == nom_a_mover && nom_a_mover == "Ilia"){
//
//                String ilia = pila.eliminar();
//                pila.Adicionar(ilia);
//                pila.Adicionar(josias);
//
//            }
           // aux.Adicionar(itemEliminado);
        }
        pila.Vaciar(aux);
        pila.Adicionar(josias);
    }

    }


