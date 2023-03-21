package javaextras3;
import java.util.Scanner;
public class Extra2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int A=1,B=2,C=3,D=4;
        int aux;
       /* System.out.print("Ingrese un A: ");
        A = leer.nextInt();
        System.out.print("Ingrese un B: ");
        B = leer.nextInt();
        System.out.print("Ingrese un C: ");
        C = leer.nextInt();
        System.out.print("Ingrese un D: ");
        D = leer.nextInt();*/
        System.out.println("Valores iniciales:  ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores finales:  ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
