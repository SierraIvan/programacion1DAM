package Ejercicio2;

import java.util.Scanner;

public class main {
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Introduce un radio");
		
		Scanner sc = new Scanner(System.in);
		Double n = sc.nextDouble();
		
		System.out.println("0- terminar programa" + "\n1- calcular area" + "\n2- calcular perimetro");
		
		Scanner sc2 = new Scanner(System.in);
		int i = sc2.nextInt();
		
		circulo circulo1 = new circulo(n);
	
		while(i != 0) {
			if(i == 1) {
				System.out.println(circulo1.getArea());
			}else if(i == 2) {
				System.out.println(circulo1.getPerimetro());
			}else {
				System.out.println("no entiendo");
			}
			i = sc.nextInt();
		}
		System.out.println("Gracias");
	
		
		
		
		
	}

}
