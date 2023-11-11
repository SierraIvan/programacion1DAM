package Stringychar;

import java.util.Scanner;
/**
 * @author Sierra
 */

public class Ejercicio4 {
/**
 * Metodo entrada
 * @param cadena
 * Metodo para invertir la palabra
 * @return
 */
	
	
	public static String invertir (String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }
	
	public static void main(String[] args) {

		
		System.out.println("introduce una frase y te la doy al reves");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String invertir = invertir(n);
		System.out.println(invertir);
	
	}

}
