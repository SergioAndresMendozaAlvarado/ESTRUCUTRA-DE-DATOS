package ejercicio;

public class Ejercicios {
    private int i;
    private int limite;
    public Ejercicios(){
        this.i = 1;
        this.limite = 10;
    }
    public void mostrarMensaje(){
        System.out.println("Hola causas");
    }
    public void genNumNat(){
        for(int i= 1;i <= 10;i++){
            System.out.println(i);
        }
    }
    public void genNumPar(){
        for(int i = 2; i <= 10; i=i+2){
            System.out.println(i);
    }
    }
    public void genNumNatWhile(){
        int i = 0;
        while (i <= 20){
            i++;
            System.out.print(i+",");

        }
    }



}
