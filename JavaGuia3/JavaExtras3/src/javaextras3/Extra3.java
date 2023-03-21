package javaextras3;
import java.util.Scanner;
public class Extra3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        String letra = leer.next();
        if (letra.equalsIgnoreCase("A"))
            System.out.println("Es una vocal A");
        if (letra.equalsIgnoreCase("E"))
            System.out.println("Es una vocal A");
        if (letra.equalsIgnoreCase("I"))    
            System.out.println("Es una vocal A");
         if (letra.equalsIgnoreCase("O"))   
            System.out.println("Es una vocal A");
         if (letra.equalsIgnoreCase("U"))   
             System.out.println("Es una vocal A");
          else
             System.out.println("La letra ingresada no es una vocal");
    }
}
