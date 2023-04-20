package PILAS;

import java.util.Scanner;

public class PilaDeCadenas {

    private int max;
    private int top;
    private String[] p;

    public PilaDeCadenas(){
        this.max = 10;
        this.top = 0;
        this.p = new String[this.max +1];

    }
    public boolean EsVacio(){
        if(this.top == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public boolean EsLleno(){
        if(this.top == this.max ){
            return true;
        }else{
            return false;
        }
    }

    public int NroElementos(){
        return top;
    }

    public String Adicionar(String nuevaCadena) {
        if (EsLleno() == true) {
            System.out.println("PILA LLENA");
        }else{
            this.top = this.top + 1;
            p[top] = nuevaCadena;
        }
        return nuevaCadena;
    }
    public String eliminar(){
        String itemEliminado = " ";
        if(EsVacio() == true){
            System.out.println("PILA VACIA");
        }
        else {
            itemEliminado = p[top];
            top = top -1;
        }
        return itemEliminado;
    }

    public void Vaciar(PilaDeCadenas pila){
        while(pila.EsVacio() ==  false){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        String item = " ";
        if(this.EsVacio() == true ){
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila de numeros: ");
            PilaDeCadenas aux = new PilaDeCadenas();
            while(EsVacio()==false){
                item = this.eliminar();
                System.out.println("Cadena: "+item);

                aux.Adicionar(item);
            }

            Vaciar(aux);
        }
    }
    public void llenar(int Nro_items){
        Scanner leer = new Scanner(System.in);
        String nombre = "";


        System.out.println("Llenando la pila de nombres (cadenas)");

        for (int i =0; i < Nro_items;i++){
            System.out.println("Ingrese el nombre: "+(i+1)+": ");
            nombre = leer.nextLine();

            Adicionar(nombre);
            System.out.println();

        }
    }

}
