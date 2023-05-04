public class Main {
    public static void main(String[] args){

        Cliente c1 = new Cliente("Sergio","Mendoza,",19,"Cruce Villa Adela","Masculino");
        Cliente c2 = new Cliente("Luis","Aguilar,",21,"Bolivar Municipal","Masculino");
        Cliente c3 = new Cliente("Sara","Quispe",17,"Nuevos Horizontes","Femenino");
        Cliente c4 = new Cliente("Andrea","Condori,",20,"Avenida Brasil","Femenino");
        Cliente c5 = new Cliente("Jhonatan","Alanoca,",31,"Puente Bolivia","Masculino");

        PilaCliente pila = new PilaCliente();

        pila.Adicionar(c1);
        pila.Adicionar(c2);
        pila.Adicionar(c3);
        pila.Adicionar(c4);
        pila.Adicionar(c5);

        pila.Mostrar();
        mayoresCiertaEdad(pila,20);

    }

    public static void mayoresCiertaEdad(PilaCliente pila, int age){

        PilaCliente aux = new PilaCliente();
        Cliente cEliminado = null;
        int cont = 0;

        while (!pila.EsVacio()){
            cEliminado = pila.eliminar();

            if(cEliminado.getEdad()>= age){
                System.out.println("El cliente: "+cEliminado.getNombres()+" Es mayor a 20 años: "+cEliminado.getEdad()+" <--- edad actual");
                cont = cont + 1;
            }
            aux.Adicionar(cEliminado);
        }
        pila.Vaciar(aux);
       // System.out.println("El nombre "+nombre+ " Se repite "+cont+" Veces");

    }

}
