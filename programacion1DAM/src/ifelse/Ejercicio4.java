package ifelse;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿en que año naciste naciste?");
		int nacimiento = sc.nextInt();
		
		int ano = 2023;
		
		int resta= ano - nacimiento;
		
		if(nacimiento>ano) {
			System.out.println("aun no has nacido");
		}else {
			System.out.println("Tienes " + resta + " años");
		}
	}

}
