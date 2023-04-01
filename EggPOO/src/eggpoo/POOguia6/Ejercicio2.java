package eggpoo.POOguia6;

public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia radio = new Circunferencia();
        radio.crearCircunferencia();
        System.out.println("Area: " + radio.Area());
        System.out.println("Parametro: " + radio.Perimetro());
        System.out.println("Radio del circulo: " + radio.getRadio());
    }

}
