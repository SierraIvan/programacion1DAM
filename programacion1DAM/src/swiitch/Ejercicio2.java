package swiitch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		System.out.println("introduce un numero");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Introduce otro numero");
		Scanner sc1=new Scanner(System.in);
		int i = sc1.nextInt();
		
		System.out.println("Ahora introduce un operador ( +, - , * , /) ");
		Scanner sc2=new Scanner(System.in);
		char o = sc2.next().charAt(0);
		
		
		
		
		switch(o) {
			case '+':
				int resultadosuma= n + i;
				System.out.println(n  + "+" + i + " = " + resultadosuma);
			break;
			case '-':
				int resultadoresta=n - i;
				System.out.println(n + "-" + i + " = " + resultadoresta);
			break;
			case '*':
				int resultadomulti=n * i;
				System.out.println(n + "*" + i + " = " + resultadomulti);
			break;
			case '/':
				if(i !=0) {
					int resultadodiv=n / i;
				System.out.println(n + "/" + i +" = " + resultadodiv);
				}else {
					System.out.println(n + "/" + i +" = " + " error");
					System.out.println("No se puede dividir entre 0");}
			break;
			default:
				System.out.println("No valido");
				
		}
		
		
	}

}
