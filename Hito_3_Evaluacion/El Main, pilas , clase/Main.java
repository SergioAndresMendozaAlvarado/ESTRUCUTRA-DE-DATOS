package Hito3_eval;

import java.util.Objects;

public class Main {
    public static void main(String[] args){

        Cliente c1 = new Cliente("Sergio","Mendoza,",19,"Cruce Villa Adela","Masculino");
        Cliente c2 = new Cliente("Luis","Aguilar,",21,"Bolivar Municipal","Masculino");
        Cliente c3 = new Cliente("Sara","Quispe",17,"Nuevos Horizontes","Femenino");
        Cliente c4 = new Cliente("Andrea","Condori,",20,"Avenida Brasil","Femenino");
        Cliente c5 = new Cliente("Jhonatan","Alanoca,",31,"Puente Bolivia","Masculino");

        PilaCliente pila = new PilaCliente();


        pila.Adicionar(c5);
        pila.Adicionar(c4);
        pila.Adicionar(c3);
        pila.Adicionar(c2);
        pila.Adicionar(c1);

        pila.Mostrar();
      //mayoresCiertaEdad(pila,20);
//

        //k_esimaPosicion(pila,3);
        //pila.Mostrar();

        //asignaDireccion(pila,"Masculino");
        //pila.Mostrar();

       reordenaPila(pila);
       pila.Mostrar();
    }

    public static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){

        PilaCliente aux = new PilaCliente();
        Cliente newclient = null;
        int cont = 0;

        while (!pila.EsVacio()){
            newclient = pila.eliminar();

            if(newclient.getEdad() >= edadMayor){
                System.out.println("El cliente "+newclient.getNombres()+" Es mayor a 20 años y su edad actual es --> "+newclient.getEdad());
                cont = cont +1;
            }
            aux.Adicionar(newclient);
        }
        pila.Vaciar(aux);
    }

    public static void k_esimaPosicion(PilaCliente pila, int var_top) {

        PilaCliente aux = new PilaCliente();
        Cliente item = null;
        Cliente item_1 = null;
        var_top = var_top -1; //important part
        aux.Vaciar(pila);

        while(!aux.EsVacio()) {
            item = aux.eliminar();

            if(aux.NroElementos()== var_top) {
                item_1 = item;
            }
            else {
                pila.Adicionar(item);
            }
        }

        pila.Adicionar(item_1);

    }

    public static void asignaDireccion(PilaCliente pila, String nuevaDireccion) {

        PilaCliente aux = new PilaCliente();
        Cliente item = null;
       // Cliente item_1 = null;
        //valorTope = valorTope -1;
        aux.Vaciar(pila);

        while(!aux.EsVacio()) {
            item = aux.eliminar();

            if(item.getGenero().equals("Femenino")) {
                item.setDireccion(nuevaDireccion);
                pila.Adicionar(aux.eliminar());
            }
            else {
                pila.Adicionar(item);
            }
        }
    }

    public static void reordenaPila(PilaCliente pila){

        PilaCliente man = new PilaCliente();
        PilaCliente women = new PilaCliente();
        Cliente item = null;

        while (!pila.EsVacio()){
            item = pila.eliminar();

            if(Objects.equals(item.getGenero(), "Femenino")){ //La libreria Objects
                                                                  //Nos ayuda a devolver un valor booleano, en este caso
                                                                  //pregunta si el valor dentro del parametro equals es igual a masculino
                                                                  //Y al cumplirse esta condicion, como tenemos dos instancias de Pila cliente para diferenciar los generos
                                                                  //Entonces al ser TRUE en el primer caso llenara la pila solo con los generos masculinos, en otro caso llenara
                                                                  //la pila con el genero femenino
                man.Adicionar(item);
            }
            else{
                women.Adicionar(item);
            }
        }

        pila.Vaciar(women);
        pila.Vaciar(man);
    }

}
