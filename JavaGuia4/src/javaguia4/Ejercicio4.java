package javaguia4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
        } while (!(numero > 0));

        if (primo(numero) == true) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " NO es primo");
        }
    }

    public static boolean primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
            if (cont > 2) {
                return false;
            }
        }
        return true;
    }

}
