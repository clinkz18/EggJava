package eggpoo.POOguia6;

import java.util.Scanner;

public class Libro {

    public String Titulo;
    public String Autor;
    public int ISBN;
    public int NumeroPaginas;
    Scanner leer = new Scanner(System.in);

    public Libro() {
    }

    public Libro(String Titulo, String Autor, int ISBN, int NumeroPaginas) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }
    
    public void CargarLibro(){
        System.out.print("Ingrese el titulo del libro: ");
        Titulo = leer.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        Autor = leer.nextLine();
        System.out.print("Ingrese el codigo ISBN del libro: ");
        ISBN = leer.nextInt();
        System.out.print("Ingrese el numero de paginas del libro: ");
        NumeroPaginas = leer.nextInt();
    }
    public void MostrarLibro(){
        System.out.println("Nombre del libro: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Paginas: " + NumeroPaginas);
    }
}
