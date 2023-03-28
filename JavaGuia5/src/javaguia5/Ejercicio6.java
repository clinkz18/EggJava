package javaguia5;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        ingresar(matriz, leer);
        mostrar(matriz);
        if (magica(matriz)) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }

    }

    public static void ingresar(int[][] mat, Scanner leer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingrese un numero entre el 1 y el 9: ");
                    mat[i][j] = leer.nextInt();
                } while (mat[i][j] < 1 && mat[i][j] > 9);
            }
        }
    }

    public static void mostrar(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.print("[" + mat[i][j] + "] = " + suma(i, mat));
                } else {
                    System.out.print("[" + mat[i][j] + "]");
                }
            }
            System.out.println("");
        }
        for (int k = 0; k < 3; k++) {
            System.out.print("|| ");
        }
        System.out.println("");
        for (int m = 0; m < 3; m++) {
            System.out.print(suma2(m, mat) + " ");
        }
        System.out.println("");
    }

    public static int suma(int i, int[][] mat) {
        int acum = 0;
        int j;
        for (j = 0; j < 3; j++) {
            acum = acum + mat[i][j];
        }
        return acum;
    }

    public static int suma2(int i, int[][] mat) {
        int acum = 0;
        int j;
        for (j = 0; j < 3; j++) {
            acum = acum + mat[j][i];
        }
        return acum;
    }

    public static boolean magica(int[][] mat) {
        int cont = 0;
        int diag1 = mat[1][1] + mat[0][0] + mat[2][2];
        int diag2 = mat[2][0] + mat[1][1] + mat[0][2];
        System.out.println("Diagonal principal: " + diag1);
        System.out.println("Diagonal secundaria: " + diag2);
        cont = iteraciones(mat);
        return cont == 6;
    }

    public static int iteraciones(int[][] mat) {
        int cont = 0;
        int acum;
        int diag1 = mat[1][1] + mat[0][0] + mat[2][2];
        int diag2 = mat[2][0] + mat[1][1] + mat[0][2];
        int i, j;
        for (i = 0; i < 3; i++) {
            acum = 0;
            for (j = 0; j < 3; j++) {
                acum = mat[i][j] + acum;
            }
            if (acum == diag1 && acum == diag2) {
                cont++;
            }
        }
        for (j = 0; j < 3; j++) {
            acum = 0;
            for (i = 0; i < 3; i++) {
                acum = mat[i][j] + acum;
            }
            if (acum == diag1 && acum == diag2) {
                cont++;
            }
        }
        return cont;

    }

}
