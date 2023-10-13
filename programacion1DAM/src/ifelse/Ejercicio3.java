package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("di un numero");
		int num = sc.nextInt();
		
		if (num %2==0) {
			System.out.println("tu numero es par");
		}else {
			System.out.println("tu numero es impar");
		}
	}

}
