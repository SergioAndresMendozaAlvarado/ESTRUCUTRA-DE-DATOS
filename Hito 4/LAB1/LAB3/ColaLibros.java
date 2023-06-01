package H4_COLAS.objetos;

public class ColaDeLibros {

    private int max;
    private int fin;
    private int ini;
    private Libros[] libros;


    public ColaDeLibros() {

        this.max = 100;
        this.fin = 0;
        this.ini = 0;
        this.libros = new Libros[this.max + 1];

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

    public void Adicionar(Libros newNumero)
    {
        if(esLlena())
        {
            System.out.println("La cola es Llena");
        }
        else
        {
            fin ++;
            libros[fin] = newNumero;

        }
    }


    public Libros eliminar()

    {
        Libros deleteNum = null;

        if(esVacia() == true)
        {
            System.out.println("La cola de libros esta Vacia");
        }
        else
        {
            ini++;
            deleteNum = libros[this.ini];

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

    public void vaciar(ColaDeLibros cola)
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
            Libros elemEliminado;
            System.out.println("Mostrando la cola de libros");

            ColaDeLibros aux = new ColaDeLibros();

            while(!esVacia())
            {
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.Adicionar(elemEliminado);
            }
            vaciar(aux);
        }


    }

}
