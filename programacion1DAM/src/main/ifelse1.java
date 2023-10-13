package main;

import java.util.Scanner;

public class ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		System.out.println("¿que nota has sacado?");
		
		int nota=sc1.nextInt();
		
		if (nota>=60) {
			System.out.println("has aprobado con un " + nota);
		}else {
			System.out.println("has suspendido con un " + nota);
		}

}
}
