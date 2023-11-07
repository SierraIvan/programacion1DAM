package ennum;

import java.util.Scanner;

public class Ejercicio1 {

	enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese un número entre 1 y 7:");
	        int n = sc.nextInt();
	        
	        if(n>=8 || n<=0) {
				System.out.println("tu eres tonto");
			}else {
				
			
	        DiaSemana dia = DiaSemana.values()[n - 1];
	        System.out.println("El dia de la semana correspondiente al número " + n + " es: " + dia);
		
		
		}
	}

}
