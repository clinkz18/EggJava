package javaextras3;
import java.util.Scanner;
public class Extra1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = leer.nextInt();
        int dias = 0;
        int horas = 0;
        while (minutos>=1440){
            dias++;
            minutos = minutos - 1440;
        }
        while (minutos>=60){
            horas++;
            minutos = minutos - 60;
        }
        System.out.println("La cantidad de dias son: " + dias + " y la canttidad de horas son: " + horas + " y los minutos sobrantes son: " + minutos);
    }
}
