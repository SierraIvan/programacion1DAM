package bulcewhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("intraduzca un numero entero");
		
		int n =sc.nextInt();
		int d=0;
		
		while(n>0) {
			n=n/10;
			d++;
		}
		System.out.println("tu numero tiene " + d + " digitos");
	}

}
