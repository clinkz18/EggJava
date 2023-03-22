package javaguia4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        ingresar();
    }

    public static void ingresar() {
        Scanner leer = new Scanner(System.in);
        String fin;
        do {
            System.out.print("Ingrese un nombre: ");
            String NOM = nombre(leer);
            System.out.print("Ingrese una edad: ");
            int EDAD = edad(leer);
            mostrar(NOM, EDAD);
            System.out.println("Desea continuar? Si/No");
            fin = leer.next();
        } while (!(fin.equals("No")));
    }

    public static void mostrar(String nomb, int ed) {
        if (ed >= 18) {
            System.out.println(nomb + " tiene " + ed + " años y es mayor de edad");
        } else {
            System.out.println(nomb + " tiene " + ed + " años y NO es mayor de edad");
        }
    }

    public static String nombre(Scanner l) {
        String nomb = l.next();
        return nomb;
    }

    public static int edad(Scanner l) {
        int ed = l.nextInt();
        return ed;
    }

}
