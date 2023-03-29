package javaguia5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz cuadrada: ");
        int dimension = leer.nextInt();
        int[][] matriz = new int[dimension][dimension];
        llenar(matriz, leer);
        if (AntiSimetrica(matriz)) {
            System.out.println("La matriz es antisimetrica.");
            mostrar(matriz);
            mostrar2(matriz);

        } else {
            System.out.println("La matriz NO es antisimetrica");
        }

    }

    public static void llenar(int[][] mat, Scanner leer) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                do {
                    System.out.print("Ingrese un numero del 1 al 9: ");
                    mat[i][j] = leer.nextInt();
                } while (mat[i][j] < 1 || mat[i][j] > 9);
            }
        }

    }

    public static void mostrar(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void mostrar2(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + (mat[j][i] * (-1)) + "]");
            }
            System.out.println("");
        }
    }

    public static boolean AntiSimetrica(int[][] mat) {
        boolean anti = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != -mat[j][i]) {
                    anti = false;
                    break;
                }
                if (!anti) {
                    break;
                }
            }
        }
        return anti;
    }

}
