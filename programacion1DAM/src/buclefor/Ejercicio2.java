package buclefor;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n;
		int suma=0;
		
		System.out.println("dime un numero y te sumo sus pares desde el 1");
		
		Scanner sc= new Scanner(System.in);
		n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if((i%2)==0) {
				System.out.println("numeros par: " + i);
				suma=suma + i;
			}	
		}
		System.out.println("La suma de todos los pares desde 1 hasta " + n + " es: " + suma);	
	}

}


