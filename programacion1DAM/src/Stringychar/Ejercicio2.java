package Stringychar;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("introduce una palabra y te cambio las 'e' por 'x' hay");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		n = n.toLowerCase();
		
		char o = 'e'; // replacing character
        char nw = 'x'; // character to be replaced
		String updatedString = n.replace(o, nw);
		System.out.println(updatedString);
	}

}
