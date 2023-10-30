package Stringychar;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("introduce una palabra y te dire cuantas vocales hay");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		 n = n.toLowerCase();
		
		String[] a = n.split("a", -1);
		String[] e = n.split("e", -1);
		String[] i = n.split("i", -1);
		String[] o = n.split("o", -1);
		String[] u = n.split("u", -1);
		int aa = a.length -1;
		int ee = e.length -1;
		int ii = i.length -1;
		int oo = o.length -1;
		int uu = u.length -1;
		
		int total = aa + ee + ii + oo + uu;
		
		System.out.println(total);
	}

}
