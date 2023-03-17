package javaguia3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        int longitud = frase.length();
        if  (longitud==8)
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
    }
}
