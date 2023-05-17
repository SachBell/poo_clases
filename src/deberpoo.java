import java.io.*;

public class deberpoo {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        boolean mm;
        System.out.println("Inserte un numero cualquiera");
        a = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Inserte otro numero");
        b = Integer.parseInt(bufEntrada.readLine());
        mm = a>b;
        if (a>b) {
            System.out.println(a+" es mayor que "+b);
        } else {
            System.out.println(b+" es mayor que "+a);
        }
    }

}