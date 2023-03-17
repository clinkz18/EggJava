package EjerciciosGuia2;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
public class Ejercicio3 {
    public static void main(String[] args){
            Scanner leer = new Scanner(System.in);
            String frase;
            System.out.println("Ingrese una frase");
            frase = leer.next();
            System.out.println(toUpperCase(frase));
            System.out.println(toLowerCase(frase));
    }
}
