package condicioneslogicas;

import java.util.Scanner;

/**
 * 
 * @author Sierra
 */
public class Ejercicio3 {

	
	/**
	 * metodo entrada
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce numeros y te dire en que orden estan");
		System.out.println("introduce un numero");
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
		
		if(n>i && i>k) {
			System.out.println("Estan en orden decreciente ");
		}else if(n<i && i<k) {
			System.out.println("Estan en orden creciente");
			
		}else {
			System.out.println("No estan en orden creciente ni decreciente.");
		}
		
		
	}

}
