package javaguia5;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        rellenar(matriz, leer);
        mostrar(matriz);
    }

    public static void rellenar(int[][] mat, Scanner leer) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un valor: ");
                mat[i][j] = leer.nextInt();
            }
        }

    }

    public static void mostrar(int[][] mat) {
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Transpuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
