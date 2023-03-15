package EjerciciosGuia2;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        float GradosCent;
        float GradosFar;
        System.out.println("Ingrese los grados centigrados");
        GradosCent = leer.nextFloat();
        GradosFar = 32 + (GradosCent*9/5);
        System.out.println("Grados Farenhait " + GradosFar);
    }
}
