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
import javax.swing.*;

public class Main {
    //Creacion de un metodo para poder ingrsar datos
    //Tal sea nombre y codigo del estudiante
    public static void main(String[] args) {
        estudiante Estudiante = new estudiante();

        /*Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);*/
        
        /*jo.showInputDialog(null, "Imgrese el codiogo del estudiante");

        jo.showInputDialog(null, "Ingrese el nombre del estudiante");*/

        /*Estudiante.ReporteDeNotas();*/

        //Llamamos al metodo datos para que nos mande la respuesta de Estudiante2
        Datos();
    } 


    // Clase del 18-05-2023 Creacion de una clase, que 
    //cuando la instanciamos llama a un promedio de notas
    public static void Datos() {

        //Declaramos tanto la variable totalNotas y la inicializamos
        //Asi como instanceamos la clase estudiante2 y lo declaramos como variable

        double totalNotas = 0;
        estudiante2 Estudiante2 = new estudiante2();
        Estudiante2.setNombre("Marco Raza");

        //Declaramos la variable jo, la cual llama a un paquete de java
        //para utilizar la interfaz gráfica e ingresar datos mas fácil

        JOptionPane jo = new JOptionPane();

        //Declaramos las variables que utilizaremos para ingresar datos
        //Y mandamos un breve mensaje

        String nombre = String.valueOf(jo.showInputDialog(null, "Ingrese el Nombre del estudiante"));
        String Id = String.valueOf(jo.showInputDialog(null, "Ingrese el ID del estudiante"));
        String curso = String.valueOf(jo.showInputDialog(null, "Ingrese el curso"));
        Double nota1 = Double.valueOf(jo.showInputDialog(null, "Ingrese la nota 1"));
        Double nota2 = Double.valueOf(jo.showInputDialog(null, "Ingrese la nota 2"));
        Double nota3 = Double.valueOf(jo.showInputDialog(null, "Ingrese la nota 3"));

        //Exportamos la variable totalNotas, ya puestos los datos
        //para que realice las operaciones en el archivo que tengamos la clase estdiante2

        totalNotas = Estudiante2.CalcularNotasEstudiante(nota1, nota2, nota3);

        //Finalmente lanzamos un mensaje con la interfaz gráfica 

        jo.showMessageDialog(null, "El promedio de notas del estudiante "+nombre+" con el ID "+Id+" y el curso "+curso+" es: "+totalNotas);
    }
}