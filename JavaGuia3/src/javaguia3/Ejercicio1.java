package javaguia3;
import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         System.out.print("Ingrese un numero: ");
         int num = leer.nextInt();
         if (num%2==0)
             System.out.println("El numero es PAR");
         else
             System.out.println("El numero  es IMPAR");
    }
}