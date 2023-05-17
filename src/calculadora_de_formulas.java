
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculadora_de_formulas {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double c;
		double cfseleccion;
		double f;
		double m;
		double seleccion;
		double snseleccion;
		System.out.println("Bienvenido a la calculadora de formulas.");
		System.out.println("Responda con 1 si necesitas calcular la 2da Ley de Newton");
		System.out.println("2 si quieres calcular de Celcios a Fahrenheit o con un 0 para salir");
		seleccion = Double.parseDouble(bufEntrada.readLine());
		while (seleccion!=0) {
			if (seleccion==2) {
				System.out.println("Ingresa 1 si vas a convertir de Celcios a Fahrenheit");
				System.out.println("O ingresa 2 si vas a convertir de Fharenheit a Celcios");
				cfseleccion = Double.parseDouble(bufEntrada.readLine());
				if (cfseleccion==1) {
					System.out.println("Ingresa el valor de Celcios");
					c = Double.parseDouble(bufEntrada.readLine());
					f = c*1.8+32;
					System.out.println(f);
					// Volvemos al bucle o lo finalizamos
					System.out.println("Responda con 1 si necesitas calcular la 2da Ley de Newton");
					System.out.println("2 si quieres calcular de Celcios a Fahrenheit o con un 0 para salir");
					System.out.println("Deseas otro calculo?");
					seleccion = Double.parseDouble(bufEntrada.readLine());
				} else {
					if (cfseleccion==2) {
						System.out.println("Escribe el valor de Fharenheit");
						f = Double.parseDouble(bufEntrada.readLine());
						c = ((f-32)/1.8);
						System.out.println(c);
						// Volvemos al bucle o lo finalizamos
						System.out.println("Responda con 1 si necesitas calcular la 2da Ley de Newton");
						System.out.println("2 si quieres calcular de Celcios a Fahrenheit o con un 0 para salir");
						System.out.println("Deseas otro calculo?");
						seleccion = Double.parseDouble(bufEntrada.readLine());
					}
				}
			}
			// Despejar Fuerza
			if (seleccion==1) {
				System.out.println("Ingresa 1 si vas a despejar Fuerza o selecciona 2 si vas a despejar masa");
				snseleccion = Double.parseDouble(bufEntrada.readLine());
				if (snseleccion==1) {
					System.out.println("Ingresa el valor de la masa");
					m = Double.parseDouble(bufEntrada.readLine());
					System.out.println("Ingresa el valor de la aceleraci�n");
					a = Double.parseDouble(bufEntrada.readLine());
					f = m*a;
					System.out.println("El valor de la Fuerza es de: "+f+"[N]");
					// Volvemos al bucle o lo finalizamos
					System.out.println("Responda con 1 si necesitas calcular la 2da Ley de Newton");
					System.out.println("2 si quieres calcular de Celcios a Fahrenheit o con un 0 para salir");
					System.out.println("Deseas otro calculo?");
					seleccion = Double.parseDouble(bufEntrada.readLine());
				} else {
					// Despejar Masa
					if (snseleccion==2) {
						System.out.println("Ingresa el valor de la Fuerza");
						f = Double.parseDouble(bufEntrada.readLine());
						System.out.println("Ingresa el valor de la a");
						a = Double.parseDouble(bufEntrada.readLine());
						m = f/a;
						System.out.println("El valor de la masa es: "+m);
						// Volvemos al bucle o lo finalizamos
						System.out.println("Responda con 1 si necesitas calcular la 2da Ley de Newton");
						System.out.println("2 si quieres calcular de Celcios a Fahrenheit o con un 0 para salir");
						System.out.println("Deseas otro calculo?");
						seleccion = Double.parseDouble(bufEntrada.readLine());
					}
				}
			}
		}
		System.out.println("Cerrando calculadora");
	}
}

