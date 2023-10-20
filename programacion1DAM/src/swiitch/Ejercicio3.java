package swiitch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce el dinero");
		Scanner sc=new Scanner(System.in);
		double n = sc.nextInt();
		
		System.out.println("Introduce si son Euros (€) o dolares ($)");
		Scanner sc1=new Scanner(System.in);
		char i = sc1.next().charAt(0);
		
		switch(i) {
			case '€':
				System.out.println(n + "€");
			break;
			case '$':
				System.out.println(n + "$");
			break;

	}
		System.out.println("quieres cambiarlos, si (y) o no (n)");
		Scanner sc2=new Scanner(System.in);
		char c=sc2.next().charAt(0);
		
			if(c=='y') {
	
				switch(i) {
				case '€':
					n=n * 1.06;
					System.out.println("Serian: " + n + "$");
				break;
				case '$':
					n=n/1.06;
					System.out.println("Serian: " + n + "€");
				break;
				}
				
				
			}else {
				System.out.println("Ok master");
			}
			
		

}
}
