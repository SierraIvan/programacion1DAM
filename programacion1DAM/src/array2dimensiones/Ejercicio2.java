package array2dimensiones;

public class Ejercicio2 {

	public static void main(String[] args) {

		
		int matriz[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};

		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for(int n = 0; n<matriz.length;n++) {
				System.out.print(matriz[i][n] + " ");
			}
		}
		System.out.print("\n");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for(int n = 0; n<matriz.length;n++) {
				System.out.print(matriz[n][i] + " ");
			}
		}

}
}
