package Ejercicio2;

public class circulo {

	
	final private double pi =3.1415;
	private double radio;
	private double area;
	private double perimetro;
	
	public circulo(double radio) {
		
		this.area = pi * (radio * radio);
		this.perimetro = 2 * pi * radio;
	
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}
	
		
		
	
	
	
	
}
