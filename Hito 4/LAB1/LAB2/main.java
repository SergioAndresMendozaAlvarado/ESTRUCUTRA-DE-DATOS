public class Main {
    //una cola es FIFO
    //FIRST INPUT FIRST OUTPUT
    public static void main(String[] args){
    ColaDeNumeros cola = new ColaDeNumeros();
        cola.Adicionar(6);
        cola.Adicionar(4);
        cola.Adicionar(8);
        cola.Adicionar(3);
        cola.Adicionar(4);
        cola.Adicionar(100);



        cola.mostrar();
        //mult_3(cola, 3);
        //eliminarRepetidos(cola);
        //cola.mostrar();

        Eliminar_elemtos_rep_V2(cola);
        //cola.mostrar();
        System.out.println(Verificar_rep(cola,4));
        cola.mostrar();




       // cola.mostrar();

    }

    public static void mult_3(ColaDeNumeros cola, int mult_3) {

        int cont = 0, item = 0;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (cola.esVacia()){

            item = cola.eliminar();

            if(item % mult_3 == 0){

                cont = cont + 1;

            }
            aux.Adicionar(item);

        }
        cola.vaciar(aux);
        System.out.println("Multiplos: ");

    }


    //ELIMINAR ELEMTOS QUE SE REPITEN


    public static void mum_rep(ColaDeNumeros cola) {

        int cont = 0, item = 0;

        ColaDeNumeros aux = new ColaDeNumeros();

        while (!cola.esVacia()){

            item = cola.eliminar();

            if(item %3 == 0){

                cont = cont + 1;

            }
            aux.Adicionar(item);

        }
        cola.vaciar(aux);
        System.out.println("Multiplos: ");

    }


    public static void eliminarRepetidos(ColaDeNumeros cola) {
        ColaDeNumeros colaAuxiliar = new ColaDeNumeros();
        while (!cola.esVacia()) {
            int elemento = cola.eliminar();
            boolean repetido = false;

            // Verificar si el elemento ya existe en la colaAuxiliar
            while (!colaAuxiliar.esVacia()) {
                int item = colaAuxiliar.eliminar();
                if (item == elemento) {
                    repetido = true;
                    break;
                }
                cola.Adicionar(item);
            }

            if (!repetido) {
                colaAuxiliar.Adicionar(elemento);
            }
        }

        cola.vaciar(colaAuxiliar);
    }

    public static void Eliminar_elemtos_rep_V2(ColaDeNumeros cola){

        int Nro_Elem = cola.nroElem();
        int item;

        for(int i = 1; i <= Nro_Elem;i++){
            item = cola.eliminar();

            if(Verificar_rep(cola, item) == false){
                cola.Adicionar(item);

            }
        }
    }

    public static boolean Verificar_rep(ColaDeNumeros cola, int num){

        int cont = 0, item, nre_Elem = cola.nroElem();

        for(int i =1;i <= nre_Elem;i++){

            item = cola.eliminar();
            if(item == num){
                cont = cont + 1;
            }else{

                cola.Adicionar(item);
            }

        }

        if(cont > 0)
            return true;
        return false;
    }

}
