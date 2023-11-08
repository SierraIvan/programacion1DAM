package array2dimensiones;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		
		int matriz1[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int matriz2[][] = {
				{9,8,7},
				{6,5,4},
				{3,2,1}
				};
		int matriz3[][];
		matriz3 = new int[3][3];
		
		for (int i = 0; i < matriz1.length; i++) {
			for(int n = 0; n<matriz2.length;n++) {
				System.out.print(matriz1[i][n] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n" + "Matriz 2");
		for (int i = 0; i < matriz1.length; i++) {
			for(int n = 0; n<matriz2.length;n++) {
				System.out.print(matriz2[i][n] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n" + "Matriz suma");
		for (int i = 0; i < matriz1.length; i++) {
			System.out.print("\n");
			for(int n = 0; n<matriz2.length;n++) {
				int resultado = matriz1[i][n] + matriz2[i][n];
				matriz3[i][n]= resultado;
				System.out.print(matriz3[i][n] + " ");
				
			}

		}
	}

}
