package javaguia3;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1, num2,opcion;
        String car="n";
        do { 
            System.out.println("Ingrese dos numeros a operar");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("MENU");
            System.out.println("1 SUMAR");
            System.out.println("2 RESTAR");
            System.out.println("3 MULTIPLICAR");
            System.out.println("4 DIVISION");
            System.out.println("5 Salir");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            
            switch (opcion){
                    case 1:
                        System.out.println("La suma es: " + (num1+num2));
                        break;
                    case 2:
                        System.out.println("La resta es: " + (num1-num2));
                        break;
                    case 3:
                        System.out.println("La multiplicacion es: " + (num1*num2));
                        break;
                    case 4:
                        if (num2==0)
                            System.out.println("No esta permitida la division por cero");
                        else
                            System.out.println("La division es: " + (num1/num2));
                        break;
                    case 5:
                        System.out.println("Desea salir de verdad? s/n");
                        car = leer.next();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
            }
        }while (!(opcion==5 && car.equalsIgnoreCase("s")));
        System.out.println("Adios");
    }
}
