/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class CalculaNominas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creacion del empleado
		
		Empleado emp1 = new Empleado("James Cosling","32000032G",'M',4,7);
		Empleado emp2 = new Empleado("Ada Lovelace","32000031R",'F');
		
		//Los empleados que tengan categoria deberan ser introducidos dentro del try/catch para asi poder hacer su validacion.
		
		try {
			emp1.validaCategoria(emp1);
			
			//Mostramos a los empleados con su sueldo.
			
			escribe(emp1);
			System.out.println();
			System.out.println();
			escribe(emp2);
			
			System.out.println("----------------------------------");
			
			//Incrementamos en 1 el anyo del emp2 y cambiamos la caregoria del emp1 de 4 a 9.
			
			emp2.incrAnyo();
			emp1.setCategoria(9);
			
			escribe(emp1);
			System.out.println();
			System.out.println();
			escribe(emp2);
			
		} catch (DatosNoCorrectosException e) {
			// TODO Auto-generated catch block
			System.out.println("Datos no correctos.");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void escribe(Empleado e) {
		Nomina n = new Nomina();
		
		System.out.println(e.imprime());
		
		System.out.println("Sueldo: " + n.sueldo(e));
		
	}

}
