package bulcewhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("intraduzca un numero entero");
		
		int n =sc.nextInt();
		int i=10;
		
		while(i<n) {
			System.out.println(n / 10);
			
		}
	}

}
