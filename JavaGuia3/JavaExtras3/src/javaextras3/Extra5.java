package javaextras3;
import java.util.Scanner;
public class Extra5 {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese un tipo de socio A, B o C: ");
     String tipoSocio = leer.next();
     System.out.print("Ingrese el monto del tratamiento: ");
     double costoTratamiento = leer.nextDouble();
     switch(tipoSocio){
         case "A": System.out.println("Monto del trataemitno: " + costoTratamiento*0.5);
             break;
         case "B": System.out.println("Monto del trataemitno: " + costoTratamiento*0.35);
             break;
         case "C": System.out.println("Monto del trataemitno: " + costoTratamiento);
             break;
         default: System.out.println("Tipo de socio incorrecto");
     }
    }
}
