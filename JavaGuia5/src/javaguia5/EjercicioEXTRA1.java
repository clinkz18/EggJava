package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int rango=0;
        dimension(rango, leer);
        int[] vector = new int[rango];
        mostrar(vector);
        System.out.println("La suma de todos los elementos del vector es: " + sumar(vector));
    }

    static public void dimension(int rango, Scanner leer) {
        System.out.print("Ingrese el rango del vector: ");
        rango = leer.nextInt();
    }
    
    static public void ingreso(int[]  vec, Scanner leer){
        for (int i=0;i<vec.length ;i++)
           vec[i] = leer.nextInt();
    }
    
    static public void mostrar(int[] vec){
        for(int i=0;i<vec.length;i++){
            System.out.print("[" + vec[i] + "] ");
        }
    }
    
    static public int sumar(int[] vec){
        int suma=0;
        for (int i=0; i<vec.length;i++){
            suma=suma+vec[i];
        }
        return suma;
    }
    
}
