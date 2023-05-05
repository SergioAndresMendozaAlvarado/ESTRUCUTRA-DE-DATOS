package Hito3_eval;

public class PilaCliente {
    private int max;
    private int top;
    private Cliente[] clientes;

    public PilaCliente(){
        this.max = 10;
        this.top = 0;
        this.clientes = new Cliente[this.max +1];

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

    public void Adicionar(Cliente nuevoCliente) {
        if(this.EsLleno()){
            System.out.println("Pila de libros llena");
        }else{
            this.top = this.top +1;
            this.clientes[this.top] = nuevoCliente;
        }
    }

    public Cliente eliminar(){
        Cliente clienteEliminado = null;

        if(!EsVacio()){
            clienteEliminado = clientes[top];
            this.top = this.top -1;
        } else {
            System.out.println("Pila de libros vacia");
        }
        return clienteEliminado;
    }

    public void Vaciar(PilaCliente pila){
        while(!pila.EsVacio()){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        Cliente cliente = null;
        if(this.EsVacio()){
            System.out.println("Pila vacia, no hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila de libros: ");
            PilaCliente aux = new PilaCliente();
            while(!EsVacio()){
                cliente = eliminar();
                aux.Adicionar(cliente);
                cliente.motrarCliente();
            }
            Vaciar(aux);
        }
    }
}
