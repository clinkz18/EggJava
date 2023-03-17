package javaguia3;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra o frase: ");
        String cadena = leer.next();
        if (cadena.substring(0,1).equals("A"))
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
    }
}