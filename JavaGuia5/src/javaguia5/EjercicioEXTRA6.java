package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        inicializarMatriz(matriz);
        ingresarPalabras(matriz, leer);
        imprimirMatriz(matriz);
    }

    public static void inicializarMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                fila[j] = String.valueOf((int) (Math.random() * 10));
            }
        }
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            String aux = "";
            for (String elemento : fila) {
                aux += "[" + elemento + "]";
            }
            System.out.println(aux);
        }
    }

    public static void ingresarPalabras(String[][] matriz, Scanner sc) {
        int[] posiciones = new int[5];
        for (int i = 0; i < 5; i++) {
            posiciones[i] = 20;
        }
        String palabra = "";
        boolean bandera;
        int fila;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                palabra = sc.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);
            do {
                bandera = true;
                fila = (int) (Math.random() * 20);
                for (int posicion : posiciones) {
                    if (posicion == fila) {
                        bandera = false;
                    }
                }
            } while (!bandera);

            for (int j = 0; j < palabra.length(); j++) {
                matriz[fila][j] = palabra.substring(j, j + 1);
            }
            posiciones[i] = fila;
        }
    }

}
