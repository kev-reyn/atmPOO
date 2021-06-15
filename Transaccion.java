/**
 * 
 */

/**
 * @author ItKevinR
 *
 * 01:52:54 AM
 */
public abstract class Transaccion {

	/**
	 * 
	 */
	 private int numeroCuenta;  
	 private BancoBD bancoBD; 


	
	public Transaccion(int numeroCuenta, BancoBD bancoBD) {
		// TODO Auto-generated constructor stub
		this.numeroCuenta = numeroCuenta;
		this.bancoBD = bancoBD;
	}
	
	public int obtenerNumeroCuenta() {
		return numeroCuenta;
	}
	
	public BancoBD obtenerBaseDeDatos() {
		return bancoBD;
	}
	
	abstract public void ejecutar();
		

}
