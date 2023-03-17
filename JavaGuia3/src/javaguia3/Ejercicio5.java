package javaguia3;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el limite superior: ");
        int limiteSup = leer.nextInt();
        int suma = 0;
        do {
            System.out.print("Ingrese un numero a sumar: ");
             suma = leer.nextInt();
             suma= suma + suma;
        } while (suma<=limiteSup);
        System.out.println("Se a superado el imite");
    }
}
