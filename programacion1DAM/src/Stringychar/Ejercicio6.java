package Stringychar;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce una palabr");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine().toLowerCase();
		
		System.out.println("introduce que letra quieres intercambiar");
		Scanner sc1 = new Scanner(System.in);
		String i = sc1.nextLine().toLowerCase();
		
		System.out.println("introduce por cual la quieres intercambiar");
		Scanner sc2 = new Scanner(System.in);
		String k = sc2.nextLine().toLowerCase();

		String updatedString = n.replace(i, k);
		System.out.println(updatedString);
		
	}

}
