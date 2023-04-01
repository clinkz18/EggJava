package eggpoo.POOguia6;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int Superficie() {
        return base * altura;
    }

    public int Perimetro() {
        return (base + altura) * 2;
    }

    public void Datos() {
        System.out.print("Ingrese la base: ");
        base = leer.nextInt();
        System.out.print("Ingrese la altura:");
        altura = leer.nextInt();
    }

    public void Dibujo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i >= 1 && i <= (altura - 2)) && (j >= 1 && j <= (base - 2))) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

}
