package swiitch;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingresa tu nota del 1 al 5");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Suspendiste, sacaste un Insuficiente y con la peor nota posible");
		break;
		case 2:
			System.out.println("Suspendiste, sacaste un Insuficiente");
		break;
		case 3:
			System.out.println("Sacaste un Suficiente");
		break;
		case 4:
			System.out.println("Muy bien, sacaste un Notable");
		break;
		case 5:
			System.out.println("Asi me gusta, sacaste un Excelente, eres un crack");
		break;
		 default:
			    System.out.println("no hay opcion correspondida para tu respuesta");
	}

		
	}

}
