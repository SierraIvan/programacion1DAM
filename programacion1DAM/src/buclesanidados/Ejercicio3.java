package buclesanidados;


/**+
 * 
 * @author Sierra
 */

public class Ejercicio3 {

	/**
	 * metodo entrada
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		
		 for( int f = 1; f <= 10 ; f++) {
			 System.out.print(f);
			 for ( int c = 1 ; c <= 10; c++) {
				 	n = c * f;
				 	System.out.print(" " + n);
			 }
			 System.out.println("");
		 }
		
	}

}
