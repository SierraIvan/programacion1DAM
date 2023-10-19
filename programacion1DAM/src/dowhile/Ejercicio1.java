package dowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.println("Introduce un numero y te doy su tabla de multiplicar hasta 10");
		Scanner sc = new Scanner(System.in);
		int n;
		int i=1;
		n = sc.nextInt();

		do
		{
		    System.out.println(n*i);
		    ++i;
		}
		while(i<=10);
		
	}

}
