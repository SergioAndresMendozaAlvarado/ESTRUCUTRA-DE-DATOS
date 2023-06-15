package ColaClientes;

public class Main {
    public static void main(String[] args){

        ColaClientes cola_client = new ColaClientes();

        Cliente c1 = new Cliente("Andres","Mendoza",19,"Bolivia","M","Gold");
        Cliente c2 = new Cliente("Jose","Condori",71,"Chile","M","Gold");
        Cliente c3 = new Cliente("Saul","Alanoca",21,"Argentina","M","Silver");
        Cliente c4 = new Cliente("Luis","Choque",22,"Bolivia","M","Silver");
        Cliente c5 = new Cliente("Marcos","Quispe",60,"Chile","M","Gold");



        cola_client.Adicionar(c1);
        cola_client.Adicionar(c2);
        cola_client.Adicionar(c3);
        cola_client.Adicionar(c4);
        cola_client.Adicionar(c5);


        ColaClientes cola_client2 = new ColaClientes();

        Cliente c6 = new Cliente("Sergio","Mendoza",19,"Bolivia","M","Gold");
        Cliente c7 = new Cliente("Edson","Condori",71,"Chile","M","Gold");
        Cliente c8 = new Cliente("Jhonatan","Alanoca",21,"Argentina","M","Silver");
        Cliente c9 = new Cliente("Mijail","Choque",22,"Bolivia","M","Silver");
        Cliente c10 = new Cliente("Victor","Quispe",60,"Chile","M","Gold");

        cola_client2.Adicionar(c6);
        cola_client2.Adicionar(c7);
        cola_client2.Adicionar(c8);
        cola_client2.Adicionar(c9);
        cola_client2.Adicionar(c10);


        System.out.println("Cola antes de la conversión:");
        cola_client.mostrar();
        cola_client2.mostrar();


        //convertirClientesVIP(cola_client, "Gold", "Bolivia");

        //moverMayoresDe60AlInicio(cola_client,60);

        agregarSaulAlInicio(cola_client,cola_client2);


        System.out.println("\nCola después de la conversión:");
        cola_client.mostrar();
        System.out.println("\nMostrando la 2da cola");
        cola_client2.mostrar();
    }

    //EJERCICIO 13, PROMOCION PARA USUARIOS BOLVIA, CONVERTIR A VIP

    public static void convertirClientesVIP(ColaClientes cola, String tipoCliente, String nacionalidad) {

        ColaClientes aux = new ColaClientes();

        while (!cola.esVacia()) {
            Cliente cliente = cola.eliminar();


            if (cliente.getPais().equals(nacionalidad) && cliente.getTipo().equals(tipoCliente)) {
                cliente.setTipo("VIP");
            }

            aux.Adicionar(cliente);
        }

        cola.vaciar(aux);
    }


    //EJERCICIO 14, MOVIENDO CLIENTES MAYORES A 60 EN LA COLA



    public static void moverMayoresDe60AlInicio(ColaClientes cola,int edad) {

        ColaClientes colaAux = new ColaClientes();
        ColaClientes colaAux2 = new ColaClientes();



        while(!cola.esVacia()) {
            Cliente cliente = cola.eliminar();

            if (cliente.getEdad() > edad) {

                colaAux.Adicionar(cliente);

            }else {

               colaAux2.Adicionar(cliente);

            }
        }
        while (!colaAux.esVacia()) {
            cola.Adicionar(colaAux.eliminar());
        }

        cola.vaciar(colaAux);
        cola.vaciar(colaAux2);
    }


    //EJERCICIO 15, MOVER A LA 2DA COLA A TODO QUIEN SE LLAME SAUL

    public static void agregarSaulAlInicio(ColaClientes cola1, ColaClientes cola2) {
        ColaClientes colaAux = new ColaClientes();

        while (!cola1.esVacia()) {
            Cliente cliente = cola1.eliminar();

            if (cliente.getNombre().equals("Saul")) {
                cola2.Adicionar(cliente);

            } else {
                colaAux.Adicionar(cliente);
            }
        }

        cola1.vaciar(colaAux);
    }
    
}
