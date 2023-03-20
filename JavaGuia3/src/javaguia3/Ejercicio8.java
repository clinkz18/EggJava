package javaguia3;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int i,j,lado;
        System.out.print("Ingrese un numero: ");
        lado = leer.nextInt() - 1;
        
        for (i=0; i<=lado; i++){
            for (j=0; j<=lado; j++){
                
                if ((i>=1 && i<=(lado-1)) && (j>=1 && j<=(lado-1))){
                    System.out.print("  ");
                }else 
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
