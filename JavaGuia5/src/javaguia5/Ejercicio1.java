package javaguia5;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        rellenar(vector);
        mostrar(vector);
    }

    public static void rellenar(int[] vec) {
        for (int i = 0; i < 100; i++) {
            vec[i] = i + 1;
        }
    }

    public static void mostrar(int[] vec) {
        for (int i = 99 ; i >=0; i--) {
            System.out.println("[" + vec[i] + "]");
        }
    }

}
