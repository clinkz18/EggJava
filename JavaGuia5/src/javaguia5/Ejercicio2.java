package javaguia5;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el rango del vector: ");
        int N = leer.nextInt();
        int[] vector = new int[N];
        rellenar(vector, N);
        buscar(vector, N, leer);
        mostrar(vector,N);
    }

    public static void rellenar(int[] vec, int N) {
        for (int i = 0; i < N; i++) {
            vec[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void buscar(int[] vec, int N, Scanner l) {
        System.out.print("Ingrese un numero a buscar en el vector: ");
        int num = l.nextInt();
        int con = 0;
        for (int i = 0; i < N; i++) {
            if (num == vec[i]) {
                System.out.println("El numero " + num + " se encontro en la posicion " + (i + 1));
                con++;
            }
        }
        System.out.println("El numero " + num + " se encontro " + con + " veces");
    }
    
    public static void mostrar(int[] vec,int N){
        for (int i=0; i<N;i++){
            System.out.println("[" + vec[i] +"]");
        }
    }
    
}
