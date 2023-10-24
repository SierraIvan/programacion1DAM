package buclesanidados;

import java.util.Scanner;

/**
 * 
 * @author Sierra
 */

public class Ejercicio2 {

	/**
	 * metodo entrada
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce un numero y te doy un triangulo hasta ese numero");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
			for( int i = 0; i <= n ;i++) {
				int num = 1;
				for( int j = 1; j <=i ; j++) {
					System.out.print(num);
					num++;
				}
				System.out.println("");
			}

	}

}
