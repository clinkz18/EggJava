package javaguia5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fila, col;
        System.out.println("Ingrese una matriz cuadrada");
        do {
            System.out.print("Ingrese las filas: ");
            fila = leer.nextInt();
            System.out.print("Ingrese las columnas: ");
            col = leer.nextInt();
        } while (!(fila == col));
        int[][] matriz = new int[fila][col];
        rellenar(matriz, leer, fila, col);
        if (antisimetria(matriz,fila, col) == true) {
            System.out.println("La matriz ES antisimeetrica");
            mostrar(matriz, fila, col);
            mostrar1(matriz, col, fila);
        } else{
            System.out.println("La matriz NO es antisimetrica");
            mostrar(matriz, fila, col);
            mostrar1(matriz, col, fila);
        }

    }

    public static void rellenar(int[][] mat, Scanner leer, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Ingrese un valor: ");
                mat[i][j] = leer.nextInt();
            }
        }
    }

    public static boolean antisimetria(int[][] mat, int fila, int col) {
        int cont = 0;
        int i,j;
        int[][] trans = new int[fila][col];
        for ( i = 0; i < fila; i++) {
            for ( j = 0; j < col; j++) {
                trans[i][j] = mat[j][i];
            }
        }

        for (i = 0; i < fila; i++) {
            for (j = 0; j < col; j++) {
                if (trans[i][j] == mat[i][j] * (-1)) {
                    cont++;
                }
            }
        }
        return (cont == (fila * col)) ;
    }

    public static void mostrar(int[][] mat, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void mostrar1(int[][] mat, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (mat[i][j]*(-1)) + "]");
            }
            System.out.println("");
        }
    }

}
