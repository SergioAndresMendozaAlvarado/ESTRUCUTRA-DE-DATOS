package problemas;
import java.util.Scanner;


public class PruebaJava {


    public static void main(String[] args) {
        
        EcuacionSegundoGrado obj = new EcuacionSegundoGrado();
        
        Scanner Scan_input = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de a");
        double a = Scan_input.nextDouble();
        
        obj.setA(a);
        
        System.out.println("Ingrese valor de b");
        
        double b = Scan_input.nextDouble();
        obj.setB(b);
        
        System.out.println("Ingrese valor de c");
        
        double c = Scan_input.nextDouble();
        obj.setC(c);
        
         System.out.println("Ingrese valor de c");
        
       
        
    }
    
}
