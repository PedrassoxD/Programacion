/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class Nomina {
	//Atributos
	private static final int SUELDO_BASE[] = {50000,70000,90000,110000,130000,150000,170000,190000,210000,230000};
	/**
	 * Constructor por defecto
	 */
	public Nomina() {
		// TODO Auto-generated constructor stub
	}
	
	//Metodos
	
	public int sueldo(Empleado e) {
		
		int sueldo;
		int sueldoBase = 0;
	
		if(e.getCategoria() == 1) {
			
			sueldoBase = SUELDO_BASE[0];
			
		}else if(e.getCategoria() == 2) {
			
			sueldoBase = SUELDO_BASE[1];
			
		}else if(e.getCategoria() == 3) {
			
			sueldoBase = SUELDO_BASE[2];
			
		}else if(e.getCategoria() == 4) {
			
			sueldoBase = SUELDO_BASE[3];
			
		}else if(e.getCategoria() == 5) {
			
			sueldoBase = SUELDO_BASE[4];
			
		}else if(e.getCategoria() == 6) {
			
			sueldoBase = SUELDO_BASE[5];
			
		}else if(e.getCategoria() == 7) {
			
			sueldoBase = SUELDO_BASE[6];
			
		}else if(e.getCategoria() == 8) {
			
			sueldoBase = SUELDO_BASE[7];
			
		}else if(e.getCategoria() == 9) {
			
			sueldoBase = SUELDO_BASE[8];
			
		}else if(e.getCategoria() == 10) {
			
			sueldoBase = SUELDO_BASE[9];
		}
		
		sueldo = sueldoBase + 5000*e.anyos;
		
		return sueldo;
		
	}

}
