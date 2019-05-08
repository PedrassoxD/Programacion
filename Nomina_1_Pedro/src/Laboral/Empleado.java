/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class Empleado extends Persona {
	//Atributos
	private int categoria;
	public int anyos;
	
	/**
	 * Constructores
	 * @param nombre = nombre del empleado
	 * @param dni = dni del empleado
	 * @param sexo = sexo del empleado
	 * @param categoria = categoria del empleado
	 * @param anyos = anyos del empleado
	 */

	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) {
		super(nombre, dni, sexo);
		this.categoria = categoria;
		this.anyos = anyos;
	}
	
	public Empleado(String nombre, String dni, char sexo) {
		super(nombre, dni, sexo);
	}
	
	//Metodos
	
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public int incrAnyo() {
		return anyos++;
	}
	
	public String imprime() {
		return nombre + "-" + dni + "-" + sexo + "-" + categoria + "-" + anyos;
	}
	
	public void validaCategoria(Empleado e) throws Exception {
		if(getCategoria() < 1 || getCategoria() > 10) {
			throw new DatosNoCorrectosException();
		}
	}

}
