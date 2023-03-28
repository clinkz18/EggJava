package javaguia5;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el rango del vector: ");
        int rango = leer.nextInt();
        int[] vector = new int[rango];
        rellenar(vector, rango, leer);
        mostrar(vector, rango);
        digitos(vector, rango);
    }

    public static void rellenar(int[] vec, int R, Scanner L) {
        for (int i = 0; i < R; i++) {
            System.out.print("Ingrese un numero de hasta 5 digitos: ");
            vec[i] = L.nextInt();
        }
    }

    public static void mostrar(int[] vec, int R) {
        for (int i = 0; i < R; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
    }

    public static void digitos(int[] vec, int R) {
        int dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, dig5 = 0, i = 0;
        int con = 0;
        double num;
        for (i = 0; i < R; i++) {
            con = 0;
            num = vec[i];
            do {
                con++;
                num = num / 10;
            } while ((num >= 1));
            if (con == 1) {
                dig1++;
            }
            if (con == 2) {
                dig2++;
            }
            if (con == 3) {
                dig3++;
            }
            if (con == 4) {
                dig4++;
            }
            if (con == 5) {
                dig5++;
            }
        }
        System.out.println("Hay " + dig1 + " numeros de un digito");
        System.out.println("Hay " + dig2 + " numeros de dos digitos");
        System.out.println("Hay " + dig3 + " numeros de tres digitos");
        System.out.println("Hay " + dig4 + " numeros de cuatro digitos");
        System.out.println("Hay " + dig5 + " numeros de cinco digitos");

    }
}
