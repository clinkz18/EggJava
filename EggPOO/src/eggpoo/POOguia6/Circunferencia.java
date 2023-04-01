package eggpoo.POOguia6;
import java.util.Scanner;
public class Circunferencia {
    Scanner leer = new Scanner(System.in);
    private double Radio;

    public Circunferencia(double Radio) {
    }

   public Circunferencia(){
   }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio:");
        Radio = leer.nextDouble();
    }
    
    public double Area(){
        return 3.14*(Radio*Radio);
    }
    
    public double Perimetro(){
        return 2*3.14*Radio;
    }
     
}
