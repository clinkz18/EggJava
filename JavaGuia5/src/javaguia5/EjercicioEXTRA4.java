package javaguia5;

import java.util.Scanner;

public class EjercicioEXTRA4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] NotasAlumnos = new double[10];
        //double[] vector1 = new double[10];
        llenar(NotasAlumnos, leer);
        aprobados(NotasAlumnos);
       /* for (int i=0;i<10;i++){
            vector1[i]=notas(leer);
        }*/
    }

    public static void llenar(double[] NotasAlumnos, Scanner leer) {
        double PrimTrabajo = 0, SegTrabajo = 0, PrimInteg = 0, SegInteg = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            promedio = 0;
            System.out.println("Ingrese las notas del alumno nº: " + (i + 1));
            System.out.print("Primer Trabajo Practico Evaluativo: ");
            PrimTrabajo = leer.nextDouble();
            System.out.print("Segundo Trabajo Practico Evaluativo: ");
            SegTrabajo = leer.nextDouble();
            System.out.print("Primer Integral: ");
            PrimInteg = leer.nextDouble();
            System.out.print("Segundo Integral: ");
            SegInteg = leer.nextDouble();
            promedio = PrimTrabajo * 0.10 + SegTrabajo * 0.15 + PrimInteg * 0.25 + SegInteg * 0.5;
            NotasAlumnos[i] = promedio*10/4;
        }

    }
   /* public static double notas(Scanner leer){
            double nota = leer.nextDouble();
            return nota;
    }*/

    public static void aprobados(double[] NotasAlumnos) {
        int con1 = 0, con2 = 0;
        for (int i = 0; i < 10; i++) {
            if (NotasAlumnos[i] >= 7) {
                System.out.println("El alumno nº:" + (i + 1) + " Aprobò     NOTA: " + NotasAlumnos[i]);
                con1++;
            } else {
                System.out.println("El alumno nº:" + (i + 1) + " Desaprobò  NOTA: " + NotasAlumnos[i]);
                con2++;
            }
        }
        System.out.println("Aprobados: " + con1);
        System.out.println("Desaprobados: " + con2);
    }

}
