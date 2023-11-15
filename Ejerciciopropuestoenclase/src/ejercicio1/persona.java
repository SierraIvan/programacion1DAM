package ejercicio1;
/**
 * 
 * @author Sierra
 */
public class persona {

	private String DNI;
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param telefono
	 */
	
	public persona(String DNI, String nombre, String apellido, int edad, String telefono) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	public String getInfo() {
		
	return "DNI: " + DNI + "\n" + "Nombre:  " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "Telefono: " + telefono;

	}

}
