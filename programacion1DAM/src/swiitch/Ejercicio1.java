package swiitch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un numero del 1 al 7 y te voy a decir su dia de la semana correspondiente");
		int i = sc.nextInt();
		switch(i) {
		  case 1:
		    System.out.println("Es lunes.");
		    break;
		  case 2:
		    System.out.println("Es martes.");
		    break;
		  case 3:
		    System.out.println("Es miercoles.");
		    break;
		  case 4:
		    System.out.println("Es jueves.");
		    break;
		  case 5:
			    System.out.println("Es viernes");
			    break;
		  case 6:
			    System.out.println("Es sabado");
			    break;
		  case 7:
			    System.out.println("Es domingo");
			    break;
		  default:
		    System.out.println("He dicho que sea entre el 1 y el 7, no hay dia de la semana que corresponda a " + i);
			}

	}

}
