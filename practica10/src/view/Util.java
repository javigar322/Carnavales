package view;

import java.util.Scanner;

public class Util {

	public static int leerInt(String pregunta) {
		System.out.print(pregunta);
		int respuesta;
		Scanner teclado = new Scanner(System.in);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
	}

	public static double leerDouble(String pregunta) {
		System.out.print(pregunta);
		double respuesta;
		Scanner teclado = new Scanner(System.in);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;
	}

	public static String leerString(String pregunta) {
		System.out.print(pregunta);
		String respuesta;
		Scanner teclado = new Scanner(System.in);
		respuesta = teclado.next();
		return respuesta;
	}
	public static Character leerCaracter(String pregunta) {
		System.out.print(pregunta);
		Character respuesta;
		Scanner teclado = new Scanner(System.in);
		respuesta = teclado.next().charAt(0);
		return respuesta;
	}

	public static void escribir(String texto) {
		System.out.println(texto);

	}
}
