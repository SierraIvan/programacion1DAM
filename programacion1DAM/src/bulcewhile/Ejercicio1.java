package bulcewhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("intraduzca un numero mayor que 1");
		
		int n =sc.nextInt();
		
		int i=1;
		
		while(i<=n) {
			System.out.println(i);
			
			i++;
		}
	}

}
