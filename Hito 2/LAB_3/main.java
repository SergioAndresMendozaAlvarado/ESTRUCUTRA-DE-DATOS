import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//tenemos doS arrays con los siguientes valores:
        //ARRAY_1 = [33,20,19,42,25]
        //ARRAY_2 = [30,20,19,13,25]
        //SE DEBE REALIZAR EL CAMBIO DE POSICION DEL ARRAY 1 POSICION 3 A LA POSICION 0 DEL ARRAY 2
        //Y A LA VEZ EL VALOR DE LA POSICION 0 DEL ARRAY 2 DEBE CAMBIAR A LA POSICION 3 DEL ARRAY 1
        //USANDO POO

        //APLICANDO PRUEBA Y ERROR:

        int[] Array_1 = new int[5];
        int[] Array_2 = new int[5];

        Array_1[0] = 33;
        Array_1[1] = 20;
        Array_1[2] = 19;
        Array_1[3] = 42; //A CAMBIAR
        Array_1[4] = 25;

        Array_2[0] = 30; //A CAMBIAR
        Array_2[1] = 20;
        Array_2[2] = 19;
        Array_2[3] = 13;
        Array_2[4] = 25;


        System.out.println(Arrays.toString(Array_1)+" primer Array");
        System.out.println(Arrays.toString(Array_2)+" segundo array Array");


        int varArray_1 = Array_1[3];
        int varArray_2 = Array_2[0];

        System.out.println(varArray_1+ " ARRAY 1 POSICION 3");
        System.out.println(varArray_2+" ARRAY 2 POSICION 0");

        Array_1[3] = varArray_2;
        Array_2[0] = varArray_1;

        System.out.println(Array_1[3] +" este es el valor del array 1 posicion 3");
        System.out.println(Array_2[0]+" Este es el 2do array posisiocn 0");

        System.out.println(Arrays.toString(Array_1)+" primer Array");
        System.out.println(Arrays.toString(Array_2)+" segundo array Array");


    }
}
