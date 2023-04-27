import PILAS.PilaDeCadenas;

import java.util.Scanner;

public class PilaDeLibros {

    private int max;
    private int top;
    private Libro[] libros;

    public PilaDeLibros(){
        this.max = 10;
        this.top = 0;
        this.libros = new Libro[this.max +1];

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

    public void Adicionar(Libro nuevoLibro) {
        if(this.EsLleno()){
            System.out.println("Pila de libros llena");
        }else{
            this.top = this.top +1;
            this.libros[this.top] = nuevoLibro;
        }
    }

    public Libro eliminar(){
        Libro libroEliminado = null;

        if(!EsVacio()){
            libroEliminado = libros[top];
            this.top = this.top -1;
        } else {
            System.out.println("Pila de libros vacia");
        }
        return libroEliminado;
    }

    public void Vaciar(PilaDeLibros pila){
        while(!pila.EsVacio()){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        Libro libro = null;
        if(this.EsVacio()){
            System.out.println("Pila vacia, no hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila de libros: ");
            PilaDeLibros aux = new PilaDeLibros();
            while(!EsVacio()){
                libro = eliminar();
                aux.Adicionar(libro);
                libro.mostrar_libro();
            }
            Vaciar(aux);
        }
    }
}
