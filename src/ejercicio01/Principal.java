package ejercicio01;

import java.util.Scanner;

import ejercicio01.Libro.Genero;

public class Principal {

	/**
	 * Scanner creado
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		// Variable de tipo Genero
		Genero genero;
		// Genero que le pediremos al usuario
		String generoCadena = "";
		
		// Le pedimos al usuario el género
		System.out.println("Introduzca el género literario de \"El Señor de los Anillos\"");
		// Lo asignamos a la cadena
		generoCadena = sc.nextLine();
		// Y luego lo asignamos al enum Genero
		genero = Libro.Genero.valueOf(generoCadena);

		// Creamos un objeto de tipo Libro
		Libro l1 = new Libro("El Señor de los Anillos", "J.R.R.Tolkien", 5, 5, genero);

		// Mostramos la información del libro
		System.out.println(l1.toString());

	

		// Cerramos el Scanner
		sc.close();
	}

}
