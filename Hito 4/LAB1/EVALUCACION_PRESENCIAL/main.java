public class Main {

    public static void main(String[] args){

        ColaClientes cola_client = new ColaClientes();
        Cliente c1 = new Cliente("Sergio","Mendoza",19,"Bolivia","M","Gold",111);
        Cliente c2 = new Cliente("Edson","Mamani",20,"Chile","M","Gold",222);
        Cliente c3 = new Cliente("Jhonatan","Condori",21,"Argentina","M","Silver",333);
        Cliente c4 = new Cliente("Mijail","Choque",61,"Bolivia","M","Silver",444);
        Cliente c5 = new Cliente("Victor","Quispe",60,"Chile","M","Gold",555);


        cola_client.Adicionar(c1);
        cola_client.Adicionar(c2);
        cola_client.Adicionar(c3);
        cola_client.Adicionar(c4);
        cola_client.Adicionar(c5);

        ColaClientes cola_clienB = new ColaClientes();

        cola_client.mostrar();
        convertirClientesVIP(cola_client);
        //edad_myor_60_years(cola_client);



        eliminarPorId(cola_client, 111);

        cola_client.mostrar();


    }

    //A todos los clientes que cumplan lo siguiente convertirlos a VIP:
    //- Si el cliente es de tipo GOLD
    //- Si el apellido del cliente empìexe con la letra M y termine con las letra ni


    public static void convertirClientesVIP(ColaClientes cola) {
        ColaClientes aux = new ColaClientes();

        while (!cola.esVacia()) {
                Cliente cliente = cola.eliminar();

                if (cliente.getTipo().equals("Gold") && cliente.getApellidos().startsWith("M") && cliente.getApellidos().endsWith("ni")) {

                    cliente.setTipo("VIP");
                } else if (cliente.getTipo().equals("Gold")) {
                    cliente.setTipo("VIP");
                }
            aux.Adicionar(cliente);
        }
            cola.vaciar(aux);
    }

    public static void convertirClientesVIP_m_ni(ColaClientes cola) {
        ColaClientes aux = new ColaClientes();

        while (!cola.esVacia()) {
            Cliente cliente = cola.eliminar();

            if (cliente.getTipo().equals("Gold")) {

                cliente.setTipo("VIP");
            }
            aux.Adicionar(cliente);
        }


        cola.vaciar(aux);
    }



    //Mover al incio a todos los clientes mayores a 60 años
    //- no utilizar while

    public static void edad_myor_60_years(ColaClientes cola) {

        ColaClientes aux = new ColaClientes();
        Cliente item = null;

        for (int i = 0; i < aux.nroElem(); i++) {

            Cliente cliente = cola.eliminar();

            if (cliente.getEdad() > 60) {

                aux.Adicionar(cliente);

            } else {
                cola.Adicionar(cliente);
            }
            cola.vaciar(aux);
        }

        cola.vaciar(aux);
    }


    //agregar un identificador


    //Crear un metodo estatico que elimine un elemento de la cola, como parametro recibe la cola y el ID

    public static void eliminar_atra(ColaClientes cola, int id){

        ColaClientes aux = new ColaClientes();
        Cliente item = null;

        while (!cola.esVacia()) {
            Cliente cliente = cola.eliminar();

            if (cliente.getId() == id) {

                aux.Adicionar(cliente);
            }
        }
        cola.vaciar(aux);

    }

    public static void eliminarPorId(ColaClientes cola, int id) {

        ColaClientes aux = new ColaClientes();

        while (!cola.esVacia()) {

            Cliente cliente = cola.eliminar();

            if (cliente.getId() != id) {

                aux.Adicionar(cliente);

            }
        }

        cola.vaciar(aux);
    }

    public static void arrays(){


    }


}
