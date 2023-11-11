package array;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {70, 3, 21, 9, 2};
	      
	       Scanner scn = new Scanner (System.in);
	       System.out.println("Introduce un número a ver si esta en la array :)");
	       int n = scn.nextInt();
	       int posicion = -1;
	      
	       for (int i = 0; i < array.length; i++) {
	       	if (array[i] == n) {
	       		posicion = i;
	       		posicion += 1;
	       		System.out.println("El valor " + n + " esta en el array, y este se encuentra en la poscion " + posicion );
	       	}
	       }
	      
	       if (posicion < 0) {
	       	System.out.println("El valor no ha sido encontrado");
	       }



		
	}

}
