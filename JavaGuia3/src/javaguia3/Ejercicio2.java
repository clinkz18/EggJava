package javaguia3;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = leer.next();
        if (cadena.equals("eureka"))
            System.out.println("Correcto! :D");
        else
            System.out.println("Incorrecto! :(");
    }
}