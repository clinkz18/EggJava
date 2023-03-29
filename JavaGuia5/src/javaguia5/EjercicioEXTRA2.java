package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el rango de los vectores: ");
        int rango = leer.nextInt();
        int[] vec1 = new int[rango], vec2 = new int[rango];
        llenar(vec1, leer);
        llenar(vec2, leer);
        boolean igual = false;
        igual = iguales(vec1, vec2);
        if (igual) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }

    public static void llenar(int[] vec, Scanner leer) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print("Ingrese un dato: ");
            vec[i] = leer.nextInt();
        }
    }

    public static boolean iguales(int[] vec1, int[] vec2) {
        int i = 0;
        for (i = 0; i < vec1.length; i++) {
            if (i == 0) {
                System.out.println("Vector 1       Vector 2");
            }
            if (vec1[i] == vec2[i]) {
                System.out.println("  [" + vec1[i] + "]     ==     [" + vec2[i] + "]");
            } else {
                System.out.println("  [" + vec1[i] + "]     !=     [" + vec2[i] + "]");
                break;
            }
        }
        return i == vec2.length;
    }

}
