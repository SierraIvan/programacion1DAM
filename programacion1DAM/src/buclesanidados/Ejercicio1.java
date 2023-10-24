package buclesanidados;

import java.util.Scanner;

/**
 * 
 * @author Sierra
 */

public class Ejercicio1 {

	/**
	 * metodo entrada
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce un numero y te doy un triangulo");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
			
			for(int i = 0; i <= n ;i++) {
				for(int j = 1; j <=i ; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

	}

}
