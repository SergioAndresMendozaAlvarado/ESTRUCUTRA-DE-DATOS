package H4_COLAS.objetos;

import java.util.Objects;

public class main {
    public static void main(String[] args) {

        ColaDeLibros colaDeLibros = new ColaDeLibros();


        Libros libros1 = new Libros(1,"Juan","masculino","MANGA",80);
        Libros libros2 = new Libros(2,"Saul","masculino","MANGA",100);
        Libros libros3 = new Libros(3,"Ana","femenino","HISTORIA",40);
        Libros libros4 = new Libros(4,"Micaela","femenino","HISTORIA",30);
        Libros libros5 = new Libros(5,"Pepito","otro","NOVELA",20);
        Libros libros6 = new Libros(6,"Pep","otro","NOVELA",20);
        Libros libros7 = new Libros(7,"Carlos","masculino","ARTE",200);

        colaDeLibros.Adicionar(libros1);
        colaDeLibros.Adicionar(libros2);
        colaDeLibros.Adicionar(libros3);
        colaDeLibros.Adicionar(libros4);
        colaDeLibros.Adicionar(libros5);
        colaDeLibros.Adicionar(libros6);
        colaDeLibros.Adicionar(libros7);

        colaDeLibros.mostrar();
        //menos_pag(colaDeLibros).mostrar();

       // colaDeLibros.mostrar();

        //gen(colaDeLibros);
        //colaDeLibros.mostrar();
        ordenarPagMenor(colaDeLibros);


    }

    public static Libros menos_pag(ColaDeLibros cola){

        ColaDeLibros aux = new ColaDeLibros();
        Libros libromenor = null;
        int menorPag = Integer.MAX_VALUE;

        while (!cola.esVacia()){

            Libros item = cola.eliminar();

            if(item.getPaginas() <= menorPag){

                menorPag = item.getPaginas();
                libromenor = item;

            }

            aux.Adicionar(item);

        }
        cola.vaciar(aux);
        return libromenor;

    }

    public static void gen(ColaDeLibros cola){

        ColaDeLibros fem = new ColaDeLibros();
        ColaDeLibros man = new ColaDeLibros();
        ColaDeLibros otro = new ColaDeLibros();

        Libros item = null;

        while (!cola.esVacia()){
            item = cola.eliminar();

            if(Objects.equals(item.getGenero(), "otro")){
                otro.Adicionar(item);

            } else if (Objects.equals(item.getGenero(), "femenino")) {
                fem.Adicionar(item);

            } else{
                man.Adicionar(item);
            }
        }

        cola.vaciar(fem);
        cola.vaciar(man);
        cola.vaciar(otro);
    }

    public static void ordenarColaGenero(ColaDeLibros cola){

        ColaDeLibros fem = new ColaDeLibros();
        ColaDeLibros man = new ColaDeLibros();
        ColaDeLibros otro = new ColaDeLibros();

        while (!cola.esVacia()){

            Libros libros = cola.eliminar();

            if(libros.getGenero().equals("femenino")){

                fem.Adicionar(libros);

            } else if (libros.getGenero().equals("masculino")) {

                man.Adicionar(libros);

            }else {

                otro.Adicionar(libros);

            }

        }
        cola.vaciar(fem);
        cola.vaciar(man);
        cola.vaciar(otro);

    }

    public static void ordenarPagMenor(ColaDeLibros cola){

        ColaDeLibros ordenado = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nreElem = cola.nroElem();

        for (int i = 1; i <= nreElem; i++){

            Libros libros = menos_pag(cola);

            while (cola.esVacia()){

                Libros item = cola.eliminar();

                if(item.getCod_Libro() == libros.getCod_Libro()){

                    ordenado.Adicionar(item);

                }else{

                    aux.Adicionar(item);

                }
            }
            cola.vaciar(aux);
        }
        cola.vaciar(ordenado);
        cola.mostrar();
    }

}

