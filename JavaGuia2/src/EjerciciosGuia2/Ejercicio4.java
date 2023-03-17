package EjerciciosGuia2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese los grados centigrados: ");
            float GradosCent = leer.nextFloat();
            System.out.println("Grados Farenhait " + (32 + (GradosCent*9/5)));
    }
}
