package EjerciciosGuia2;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            int num;
            float raizCuadrada;
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            raizCuadrada  = (float) sqrt(num);
            System.out.println("Doble " + num*2);
            System.out.println("Triple " + num*3);
            System.out.println("Raiz cuadrada " + raizCuadrada);
    }
}
