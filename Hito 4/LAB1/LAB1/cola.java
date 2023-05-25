public class ColaDeNumeros {

    private int ini;
    private int fin;
    private int max;
    private int[] numeros;

    public ColaDeNumeros(){

        this.max = 10;
        this.ini = 0;
        this.fin = 0;
        this.numeros = new int[this.max + 1];

    }

    public boolean esVacio(){

        if (ini == 0 && fin == 0){
            return true;
        }else{
            return false;
        }

    }

    public boolean esLleno(){

        if(fin == max){
            return true;
        }else {
            return false;
        }

    }

    public void Adiconar(int NuevaCola){

        if(esLleno() == true){
            System.out.println("Cola llena");
        }
        else{
            this.fin = this.fin + 1;
            numeros[fin] = NuevaCola;
        }

    }

    public int eliminar() {
        int itemEliminado = 0;
        if(esVacio() == true){
            System.out.println("Cola vacia");
        }
        else {
            this.ini = this.ini + 1;
            itemEliminado = numeros[this.ini];

            if(ini == fin){
                ini = 0;
                fin = 0;
            }

        }
        return itemEliminado;
    }

    public int nroElemento(){

        return fin - ini;

    }

    public void vaciar(ColaDeNumeros cola) {
        int elementoEliminado;
        while (!cola.esVacio() == false){

            elementoEliminado = cola.eliminar();
            Adiconar(elementoEliminado);
        }
    }

    public void mostrar(){
        int item;

        if (esVacio()==true){
            System.out.println("Cola vacia, no hay items ");

        }else{

            System.out.println("MOSTRANDO COLAS DE NUMEROS: ");
            ColaDeNumeros aux = new ColaDeNumeros();

            while(!esVacio()){
                item = eliminar();
                System.out.println("NUMERO = " + item);
                aux.Adiconar(item);
            }

            vaciar(aux);

        }
    }


}
