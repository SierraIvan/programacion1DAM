package bulcewhile;

import java.util.Scanner;

/**
 * class Ejercicio5
 * @author Sierra
 */
public class Ejercicio5 {
	
	/**
	 * Metodo de entrada
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Estas son las variables
		 */
		
		int n = 1;// numero que comprobaremos si son divisibles entre 2 y 3
		int posicion = 0;// numero de la posición en la que esta el numero en la lista
		
		while(n<=10000) {
			n++;
			if(n % 2 == 0 && n % 3 == 0) {
				posicion++;
				System.out.println(n + " Es el numero " + posicion + " de la lista");
			
				
				
			}
		}
	}
}
