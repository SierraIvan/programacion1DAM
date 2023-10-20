package swiitch;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Elige una opción");
		System.out.println("1- Mostrar infromación");
		System.out.println("2- Editar perfil");
		System.out.println("3- Salir");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Estas en Mostrar información");
		break;
		case 2:
			System.out.println("Estas en Editar perfil");
		break;
		case 3:
			System.out.println("Has salido");
		break;
		 default:
			    System.out.println("no hay opcion correspondida para tu respuesta");
	}

}
}
