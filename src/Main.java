/**
* Programa Test Prog001
* @Autor Sach_Bell
* @version 1.0.0
*/

/*
* Este proyecto es una base de aprendizaje
* lo que se practique aquí es para recordar viejas cosas
* y ver ayudas de codigos anteriores
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    //Creamos un comentario para imprimirlo en consola
    public static void main(String[] args) {
        estudiante Estudiante = new estudiante();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Imgrese el codiogo del estudiante");
        Estudiante.setCodigoEstudiante(sc1.nextInt());

        System.out.println("Ingrese el nombre del estudiante");
        Estudiante.setNombre(sc2.nextLine());

        Estudiante.ReporteDeNotas();

        

    }
}