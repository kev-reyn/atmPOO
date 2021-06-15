/**
 * 
 */


/**
 * @author ItKevinR
 *
 * 12:02:15 AM
 */
public class BancoBD {

	/**
	 * 
	 */
	
	private Cuenta cuentas[];
	
	public BancoBD() {
		// TODO Auto-generated constructor stub
		cuentas = new Cuenta[2];
		cuentas[ 0 ] = new Cuenta( 12345, 54321, 1000.0, 1200.0 );
		cuentas[ 1 ] = new Cuenta( 98765, 56789, 200.0, 200.0 );  
		}
	
	private Cuenta obtenerCuenta( int numeroCuenta )
	   {
	      for ( Cuenta cuentaActual : cuentas ){
	         if ( cuentaActual.ObtenerNumeroCuenta()== numeroCuenta )
	            return cuentaActual;
	      } 

	      return null; 
	   }  
	
	public boolean autentificarCuenta(int numeroCuenta, int nip) {
		Cuenta cuentaUsuario = obtenerCuenta(numeroCuenta);
		
		if(cuentaUsuario != null) {
			return cuentaUsuario.ValidacionNIP(nip);
			}else
				return false;
		}
	
	public double obtenerSaldoDispobible(int numeroCuenta) {
		return obtenerCuenta(numeroCuenta).SaldoDisponible();
	}

	public double obtenerSaldoTotal(int numeroCuenta) {
		return obtenerCuenta(numeroCuenta).SaldoTotal();
	}
	
	public void abonar(int numeroCuenta, double monto) {
		obtenerCuenta(numeroCuenta).Abonar(monto);
	}
	
	public void retiro(int numeroCuenta, double monto) {
		obtenerCuenta(numeroCuenta).Retirar(monto);
	}

}

	

