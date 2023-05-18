package H4_COLAS;

public class Main {
    //una cola es FIFO
    //FIRST INPUT FIRST OUTPUT
    public static void main(String[] args){
    ColaDeNumeros cola = new ColaDeNumeros();
        cola.Adiconar(4);
        cola.Adiconar(6);
        cola.Adiconar(8);
        cola.Adiconar(3);
        cola.Adiconar(4);
        cola.Adiconar(100);

        cola.mostrar();
        //mult_3(cola, 3);

        //cola.mostrar();
    }

    public static void mult_3(ColaDeNumeros cola, int mult_3) {

        int cont = 0, item = 0;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (cola.esVacio()){

            item = cola.eliminar();

            if(item % mult_3 == 0){

                cont = cont + 1;

            }
            aux.Adiconar(item);

        }
        cola.vaciar(aux);
        System.out.println("Multiplos: ");

    }


    //ELIMINAR ELEMTOS QUE SE REPITEN


    public static void mum_rep(ColaDeNumeros cola) {

        int cont = 0, item = 0;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (!cola.esVacio()){

            item = cola.eliminar();

            if(item %3 == 0){

                cont = cont + 1;

            }
            aux.Adiconar(item);

        }
        cola.vaciar(aux);
        System.out.println("Multiplos: ");

    }


}
