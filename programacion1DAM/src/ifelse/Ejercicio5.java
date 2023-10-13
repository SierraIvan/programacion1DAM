package ifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Di un numero entre el 1 y el 100");
		int num = sc.nextInt();
		
		if(num>1 && num<33 && num>33 && num<100) {
			System.out.println("Estas dentro del rango");
		}else if (num==33){
			
		System.out.println("¿Dijiste 33? el nanooo, se viene la 33");
		
		}else {
			System.out.println("... creo que tienes mas cromosomas de los que deberias");
		}
	}

}
