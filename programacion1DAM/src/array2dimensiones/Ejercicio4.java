package array2dimensiones;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		
		int veces=0;
		int matriz[][] = {
				{1,2,3},
				{4,5,1},
				{7,3,9}
				};
		System.out.print("Matriz original");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for(int n = 0; n<matriz.length;n++) {
				System.out.print(matriz[i][n] + " ");
			}
		}
		
		while(veces!=3) {
		System.out.println("\ndime una ubicacion 0-2, 2 numeros");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Scanner sc1= new Scanner(System.in);
		int i = sc1.nextInt();
		System.out.println("dime otra ubicacion 0-2, 2 numeros");
		Scanner sc2 = new Scanner(System.in);
		int j = sc2.nextInt();
		Scanner sc3= new Scanner(System.in);
		int k = sc3.nextInt();
		System.out.println("por ultimo dime otra ubicacion 0-2, 2 numeros");
		Scanner sc4 = new Scanner(System.in);
		int p = sc4.nextInt();
		Scanner sc5= new Scanner(System.in);
		int l = sc5.nextInt();
		
				while(n<=matriz.length && n>=0 && i<=matriz.length && i>=0 && j<=matriz.length && j>=0 && k<=matriz.length && k>=0 && p<=matriz.length && p>=0 && l<=matriz.length && l>=0) {
					
					veces++;
					  int a = matriz[n][i];
					  int b = matriz[j][k];
					  int c = matriz[p][l];
					  int suma = a + b + c;
					  System.out.println("La suma de los numeros " + a + " + " + b + " + " + c + " es: " + suma);
					  a = sc.nextInt();
				
				}System.out.println("Alguna posicion es invalida");

	}
	}
}
