package eggpoo.POOguia6;

public class Ejercicio3 {

    public static void main(String[] args) {
        Operacion calculo = new Operacion();
        calculo.crearOperacion();
        System.out.println("Suma: " + calculo.Sumar());
        System.out.println("Resta: " + calculo.Restar());
        if (calculo.getNumero1() != 0 && calculo.getNumero2() != 0) {
            System.out.println("Muliplicacion: " + calculo.Multiplicar());
        } else {
            System.out.println(calculo.Multiplicar());
        }
        if (calculo.getNumero1() != 0 && calculo.getNumero2() != 0) {
            System.out.println("Division: " + calculo.Dividir());
        } else {
            System.out.println(calculo.Dividir());
        }
    }

}
