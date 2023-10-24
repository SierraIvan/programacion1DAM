package condicioneslogicas;

import java.util.Scanner;
/**
 * 
 * @author Sierra
 */

public class Ejercicio1 {
/**
 * metodo de entrada
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("dime el numero de lados iguales que tenga el triangulo");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // numero de lados que debe introducir el usuario
		
		if(n==1 || n == 0) {
			System.out.println("tu triangulo es escaleno");
		}else if(n == 2) {
			System.out.println("tu triangulo es isosceles");
		}else if(n == 3) {
			System.out.println("tu triangulo es equilatero");
		}else {
			System.out.println("si un triangulo tiene mas de 3 lados, hay un problema");
		}
		
		
		
	}

}
