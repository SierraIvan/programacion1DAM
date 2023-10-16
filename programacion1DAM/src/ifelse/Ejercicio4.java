package ifelse;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿en que año naciste naciste?");
		int nacimiento = sc.nextInt();
		
		// Year.now () .get Value() es para marcar el año actual
		
		int ano = Year.now() .getValue();
		
		int resta= ano - nacimiento;
		
		if(nacimiento>ano) {
			System.out.println("aun no has nacido");
		}else {
			System.out.println("Tienes " + resta + " años");
		}
	}

}
