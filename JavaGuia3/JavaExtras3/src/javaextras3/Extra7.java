package javaextras3;
import java.util.Scanner;
public class Extra7 {
     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
     int cantNum,cant = 1;
     int mayor = 0,menor = 0,numero;
     float promedio = 0;
     do{
         System.out.print("Ingrese la cantidad de numeros a computar: ");
         cantNum = leer.nextInt();
     }while (cantNum<=0);
     
     /*
     do{
         System.out.print("Ingrese un numero: ");
         numero = leer.nextInt();
         if (cant==1){
             mayor=numero;
             menor=numero;
         }
         if (numero>mayor)
             mayor = numero;
         if (numero<menor)
             menor = numero;
         
         promedio = promedio + numero;
         cant++;
     }while (cant<=cantNum);
     */
     
     while (cant<=cantNum){
          System.out.print("Ingrese un numero: ");
         numero = leer.nextInt();
         if (cant==1){
             mayor=numero;
             menor=numero;
         }
         if (numero>mayor)
             mayor = numero;
         if (numero<menor)
             menor = numero;
         
         promedio = promedio + numero;
         cant++;
     }
     
     System.out.println("El promedio de los numero es: " + (promedio/cantNum));
     System.out.println("El mayor numero ingresado es: " + mayor);
     System.out.println("El menor numero ingresado es: " + menor);
    }
}
