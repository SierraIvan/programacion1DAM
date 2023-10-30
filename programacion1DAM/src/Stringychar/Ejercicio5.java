package Stringychar;

import java.util.Scanner;

/**
 * 
 * @author Sierra
 */

public class Ejercicio5 {

	/**
	 * Metodo de entrada
	 * @param args
	 */
	
	public static String invertir (String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce una frase y te digo si es un palíndromo");
		Scanner sc = new Scanner(System.in);
		String n =sc.nextLine().toLowerCase();
		String invert = invertir(n);
		
		if(n.equals(invert)) {
			System.out.println("Es palíndromo");
			
		}else {
			System.out.println("No es pal ́ındromo");
		}
		
		
		
		
		
		
		
	}

}
