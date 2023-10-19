package bulcewhile;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Adivina un numero entre el 1 y el 100");
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i=1;
		int r = ThreadLocalRandom.current().nextInt(1, 100);
		
		while(i>0) {
			
			if(n>r) {
				System.out.println("Sigue intentandolo, el numero es menor");
				n =sc.nextInt();
			}else if(n<r){System.out.println("Sigue intentandolo, el numero es mayor");
			n =sc.nextInt();
			
				}else{
					System.out.println("Felicidades acertaste el numero");
					n =sc.nextInt();
					sc.close();
					
				}
			
		}
		
	}

}
