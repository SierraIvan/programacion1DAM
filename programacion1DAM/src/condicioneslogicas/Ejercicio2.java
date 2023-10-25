package condicioneslogicas;

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

		/**
		 * declaramos los numeros que introduce el usuario
		 */
		
		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Introduce otro numero");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		System.out.println("Introduce un tercer numero");
		Scanner sc2 = new Scanner(System.in);
		int k = sc2.nextInt();
		sc.close();
		sc1.close();
		sc2.close();
	
		
		if(n>i && n>k) {
			System.out.println("el numero mas grande es el primero: " + n);
		}else if(i>n && i>k) {
			System.out.println("el numero mas grande es el segundo: " + i);
		}else if(k>n && k>i) {
			System.out.println("el numero mas grande es el tercero: " + k);
		}
		
		
	}

}
