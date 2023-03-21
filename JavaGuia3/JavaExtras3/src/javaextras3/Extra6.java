package javaextras3;
import java.util.Scanner;
public class Extra6 {
     public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.print("Ingrese la cantidad de personas: ");
     int cantPersonas = leer.nextInt();
     float altura;
     int cont160 = 0;
     float promedio160 = 0, promedioGeneral = 0;
     for (int i = 0; i<=(cantPersonas-1);i++){
         System.out.print("Ingrese la altura de la persona " + (i+1) + ": ");
         altura = leer.nextFloat();
         if (altura<1.60){
             cont160++;
             promedio160 = promedio160 + altura;
         }
         promedioGeneral = promedioGeneral + altura;
     }
     System.out.println("El promedio general es: " + (promedioGeneral/cantPersonas));
     System.out.println("El promedio de menores a 1,60 mts es: " + (promedio160/cont160));
    }
}
