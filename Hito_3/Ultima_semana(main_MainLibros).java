import PILAS.PilaDeCadenas;

public class MainLibros {
    public static void main(String[] args){
        Libro libro1A = new Libro("Homero_A",500,30.00,"La Odisea","Historia");
        Libro libro2A = new Libro("Homero_A",300,20.00,"La Illada","Historia");

        PilaDeLibros pilaA = new PilaDeLibros();
        pilaA.Adicionar(libro2A);
        pilaA.Adicionar(libro1A);


        Libro libro1B = new Libro("Jose",500,50.00,"La Santa","Historia");

        Libro libro2B = new Libro("Miguel",300,15.00,"La Biblia","Historia");

        PilaDeLibros pilaB = new PilaDeLibros();
        pilaB.Adicionar(libro2B);
        pilaB.Adicionar(libro1B);

        //pilaA.Mostrar();
        //pilaB.Mostrar();


       // pila.Mostrar();



        //precio_libro(pila,25);
        //determinar cuantos libros tiene el costo mayor a 25bs


       //descuento(pilaA,pilaB);
        precio_mayor(pilaA);

    }
    public static void precio_mayor(PilaDeLibros pila){
        PilaDeLibros aux = new PilaDeLibros();
        Libro libro = null;
        double max = Integer.MIN_VALUE;

        while(!pila.EsVacio()){
            libro = pila.eliminar();
            if (libro.getPrecio() > max){
                max = libro.getPrecio();
            }
            aux.Adicionar(libro);
        }
    }

    public static void precio_libro(PilaDeLibros pila, double precio){

        PilaDeLibros aux = new PilaDeLibros();
       Libro item = null;
       int cont = 0;

       while (!pila.EsVacio()){
           item = pila.eliminar();
           if(item.getPrecio() > precio){
               cont = cont + 1;
           }
           aux.Adicionar(item);
       }
       pila.Vaciar(aux);
       System.out.println("Libros con repcio mayor a "+precio+" bs = "+cont);

    }

    public static void descuento(PilaDeLibros pila,PilaDeLibros pilaB){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        double cont = 0;
        double des, men;

        while (!pila.EsVacio()){
            item = pila.eliminar();
            if(item.getCategoria().equals("Historia")){
                cont = (double)(item.getPrecio()*0.1);
                des = (double)(item.getPrecio()-cont);
                System.out.println("Los libros de historia tienen un descuento de 10% ");
                System.out.println("Precio antes: "+item.getPrecio());
                System.out.println("Precio nuevo: " +des);
            }

        }

    }

    public static void x(){

    }

    }
