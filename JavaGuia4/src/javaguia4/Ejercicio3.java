package javaguia4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String moneda;
        do {
            System.out.print("Ingrese un tipo de moneda: ");
            moneda = leer.next();
        } while (!(moneda.equals("libra") || moneda.equals("dolar") || moneda.equals("yen")));
        System.out.print("Ingrese una la cantidad de euros a combertir: ");
        double monto = leer.nextDouble();
        cambio(monto, moneda);

    }

    public static void cambio(double euros, String moneda) {
        double valor = 0;
        if (moneda.equals("libra")) {
            valor = euros * 0.86;
        }
        if (moneda.equals("dolar")) {
            valor = euros * 1.28611;
        }
        if (moneda.equals("yen")) {
            valor = euros * 129.852;
        }
        System.out.println("El cambio de " + euros + " euros a " + moneda + " es: " + valor);
    }
}
