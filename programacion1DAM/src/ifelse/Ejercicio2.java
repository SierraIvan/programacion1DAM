package ifelse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("di un numero, positivo o negativo");
		
		int num =sc.nextInt();
		
		if (num==0) {
			System.out.println("el numero es 0");
		}else if (num>0) {
			System.out.println("tu numero es positivo");
		}else{
			System.out.println("tu numero es negativo");
		}

	}

}
