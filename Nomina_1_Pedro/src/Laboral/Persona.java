/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class Persona {
	//Atributos
	public String nombre;
	public String dni;
	public char sexo;
	
	/**
	 * Constructores
	 * @param nombre = nombre de la persona
	 * @param dni = dni de la persona
	 * @param sexo = sexo de la persona
	 */
	public Persona(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}

	public Persona(String nombre, char sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	//Metodos
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public String imprime() {
		return nombre + "-" + dni;
	}
	
	
	
}
