public class ColaClientes{

    private int max;
    private int fin;
    private int ini;
    private Cliente[] clientes;


    public ColaClientes() {

        this.max = 100;
        this.fin = 0;
        this.ini = 0;

        this.clientes = new Cliente[this.max + 1];

    }


    public boolean esVacia() {
        if(ini == 0 && fin == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean esLlena() {
        if(fin == max ) {
            return true;
        }
        else {
            return false;
        }
    }

    public void Adicionar(Cliente newNumero)
    {
        if(esLlena())
        {
            System.out.println("La cola esta Llena");
        }
        else
        {
            fin ++;
            clientes[fin] = newNumero;

        }
    }


    public Cliente eliminar()

    {
        Cliente deleteNum = null;

        if(esVacia() == true)
        {
            System.out.println("La cola de Clientes esta Vacia");
        }
        else
        {
            ini++;
            deleteNum = clientes[this.ini];

            if(ini == fin) {
                ini = 0;
                fin = 0;
            }


        }

        return deleteNum;
    }


    public int nroElem()
    {
        return fin - ini;
    }

    public void vaciar(ColaClientes cola)
    {
        while(!cola.esVacia())
            Adicionar(cola.eliminar());
    }

    public void mostrar()
    {
        //int item = 0;
        if(esVacia())
        {
            System.out.println("\n No hay item que mostrar");
        }
        else
        {
            Cliente elemEliminado;
            System.out.println("Mostrando la cola de Clientes");

            ColaClientes aux = new ColaClientes();

            while(!esVacia())
            {
                elemEliminado = eliminar();
                elemEliminado.mostrar_clien();
                aux.Adicionar(elemEliminado);
            }
            vaciar(aux);
        }


    }

}
