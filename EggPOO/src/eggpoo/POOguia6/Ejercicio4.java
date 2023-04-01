package eggpoo.POOguia6;

public class Ejercicio4 {

    public static void main(String[] args) {
        Rectangulo figura = new Rectangulo();
        figura.Datos();
        System.out.println("Superficie del rectangulo: " + figura.Superficie());
        System.out.println("Perimetro del rectangulo: " + figura.Perimetro());
        System.out.println("Ahora el cuadrado");
        figura.Dibujo();
    }

}
