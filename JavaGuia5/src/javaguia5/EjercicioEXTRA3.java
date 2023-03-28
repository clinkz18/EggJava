package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int filas = leer.nextInt();
        int[] vector = new int[filas];
        aleatorio(vector, filas);
        mostrar(vector, filas);
    }

    public static void aleatorio(int[] vec, int filas) {
        for (int i = 0; i < filas; i++) {
            vec[i] = (int) (Math.random() * 100 + 1);
        }
    }

    public static void mostrar(int[] vec, int filas) {
        String aux="";
        for (int i = 0; i < filas; i++) {
           aux += "[" + vec[i] + "] ";
        }
        System.out.println(aux);
    }
}
