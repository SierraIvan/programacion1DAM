package array2dimensiones;

public class Ejercicio3 {

	public static void main(String[] args) {

	
		int matriz[][] = {
				{5,10,15},
				{20,25,30},
				{35,40,45}
				};
System.out.print("Matriz original");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("\n");
			for(int n = 0; n<matriz.length;n++) {
				System.out.print(matriz[i][n] + " ");
			}
		}
		
		
		/*Promedio en filas*/
			System.out.println("\n");
		System.out.println("\nPromedio en filas");
		
		 for (int i = 0; i < matriz.length; i++) {
			 int suma = 0;
				int sumatotal = 0;
	            for (int j = 0; j < matriz.length; j++) {
	            	suma += matriz[i][j];
	                sumatotal++;
	            }
                double promedio = suma / sumatotal;
       		 System.out.println(promedio);
		 }
		 
		 /*Promedio en columnas*/
			System.out.println("\nPromedio en columnas");
			
			 for (int i = 0; i < matriz.length; i++) {
				 int suma = 0;
					int sumatotal = 0;
		            for (int j = 0; j < matriz.length; j++) {
		            	suma += matriz[j][i];
		                sumatotal++;
		            }
	                double promedio = suma / sumatotal;
	       		 System.out.println(promedio);
			 }
		 
		 
				}
		
	


}

