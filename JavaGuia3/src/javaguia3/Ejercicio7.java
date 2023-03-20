package javaguia3;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String cadena;
        int contCor= 0,  contIn=0;
        int longitud;
        do{
            System.out.print("Ingrese una cadena de RS232: ");
            cadena = leer.next();
            longitud = cadena. length();
            if (cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O") && longitud==5){
                contCor++;
            }else{
                contIn++;
            }
        }while(!(cadena.equals("&&&&&")));
        System.out.println("Se ingresaron correctamente: " + contCor  + " cadenas");
        System.out.println("Se ingresaron incorrectamente: " + (contIn-1)  + " cadenas");
    }
}
