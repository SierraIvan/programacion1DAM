package array;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int[] array = new int[] {70, 3, 21, 9, 2};
		
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Número a eliminar:");
		int n = sc.nextInt();
		
		int finalarray[] = new int[array.length];
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] != n) {
				finalarray[j] = array[i];
				j++;
			}
			else {
				finalarray[4] = array[4];
			}
		}
		for(int i = 0; i < finalarray.length; i++) {
			System.out.println(finalarray[i] + " ");
		}
		
	}

}
