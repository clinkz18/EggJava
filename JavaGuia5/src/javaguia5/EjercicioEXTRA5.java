package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese las filas: ");
        int filas = leer.nextInt();
        System.out.print("Ingrese las columnas: ");
        int col = leer.nextInt();
        int[][] matriz = new int[filas][col];
        llenar(matriz, filas, col);
        mostrar(matriz, filas, col);
        System.out.println("La suma de los elementos de la matriz: " + suma(matriz, filas, col));
    }

    public static void llenar(int[][] mat, int filas, int col) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    public static void mostrar(int[][] mat, int filas, int col) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static int suma(int[][] mat, int filas, int col) {
        int acum = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < col; j++) {
                acum = acum + mat[i][j];
            }
        }
        return acum;
    }

}
