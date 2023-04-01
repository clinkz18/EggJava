package eggpoo.POOguia6;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro();
        String resp = "";
        do {
            l1.CargarLibro();
            l1.MostrarLibro();
            System.out.println("Desea Ingresar otro libro? si/no");
            resp = leer.next();
        } while (resp.equals("no"));
    }
}
