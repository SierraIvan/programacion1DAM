package dowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


		System.out.println("Introduce un numero");
		Scanner sc = new Scanner(System.in);
		int i=1;
		int n = sc.nextInt();
		int suma=0;

		do{
		    if((i%2)==0) {
		    	suma += i; //es como suma = suma + i
				System.out.println(i);
			}
		    i++;
		}
		while(n>=i);
		System.out.println("La suma total de todos los pares de uno hasta " + n + ": " + suma);
		
	}

}
