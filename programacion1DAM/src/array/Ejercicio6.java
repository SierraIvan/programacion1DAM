package array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamaño = 10;
		int[] numerosramdom = new int [tamaño];
		
		 // Genera números enteros aleatorios y llena el array
		
       Random aleatorio = new Random();
       for (int i = 0; i < tamaño; i++) {
           numerosramdom[i] = aleatorio.nextInt(20);
       }
      
       // Imprimo los numeros del array
      
       System.out.println("Array original:");
       for (int numeros : numerosramdom){ // El : en un bucle for sirve para la iteracion con los arrays
       	System.out.print(numeros + " ");
       }
		
       
       System.out.println("\n" + "Introduce la posicion del elemento del 0-9");
       Scanner sc1 = new Scanner(System.in);
       int n1 = sc1.nextInt();
       
       
       System.out.println("Introduce el elemento que quieres añadir");
       Scanner sc2 = new Scanner(System.in);
       int n2 = sc2.nextInt();

       
       System.out.println("Nuevo Array");
       
       numerosramdom[n1] = n2;
       
       
       

       for (int numeros : numerosramdom) {
    	   System.out.print(numeros + " ");
       }
       
  
       
       
      
      

		
	}


}
