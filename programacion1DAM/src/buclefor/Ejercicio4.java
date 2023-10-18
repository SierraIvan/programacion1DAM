package buclefor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un numero entero positivo");
		
		int n;
		int f=1;
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n>0) {
			
			for(int i=1;i<=n;i++) {
				
				f=f * i;
					System.out.println(f);
			}
			System.out.println("La multiplicacion de todos sus numero de este factorial es: " + f);
		}else {
			
			System.out.println("Na, tu eres como rarito no?");
		}
		
	}
}

