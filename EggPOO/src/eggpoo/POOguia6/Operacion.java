package eggpoo.POOguia6;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese un dato: ");
        numero1 = leer.nextInt();
        System.out.println("Otro dato: ");
        numero2 = leer.nextInt();
    }

    public int Sumar() {
        return numero1 + numero2;
    }

    public int Restar() {
        return numero1 - numero2;
    }

    public int Multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error");
            return 0;
        }
        return numero1 * numero2;
    }

    public int Dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede divir por cero");
            return 0;
        }
        return numero1 / numero2;
    }

}
