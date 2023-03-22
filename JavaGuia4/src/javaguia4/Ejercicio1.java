package javaguia4;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a operar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        switch (menu()) {
            case 1:
                System.out.println("Suma: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("Resta: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("Multiplicacion: " + multiplicar(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    System.out.println("Dividir: " + dividir(num1, num2));
                }
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("***** MENU *****");
        System.out.println("1 PARA SUMAR");
        System.out.println("2 PARA RESTAR");
        System.out.println("3 PARA MULTIPLICAR");
        System.out.println("4 PARA DIVIDIR");
        System.out.print("Ingrese una opcion: ");
        int op = leer.nextInt();
        return op;
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static float dividir(int num1, int num2) {
        return num1 / num2;
    }
}
