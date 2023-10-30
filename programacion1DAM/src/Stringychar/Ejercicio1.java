package Stringychar;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce una palabra y te dire cuantas ''a'' hay");
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine().toLowerCase();

		String[] parts = linea.split("a", -1);
		int nA = parts.length - 1;
		
		System.out.println(nA);
	}

}
