/**
 * 
 */

/**
 * @author ItKevinR
 *
 * 11:42:46 PM
 */
public class Cuenta {

	/**
	 * 
	 */
	
	private int numeroCuenta;
	private int uNIP;
	private double saldoDisponible;
	private double saldoTotal;
	
	public Cuenta(int numeroCuenta,int NIP,double saldoDisponible,double saldoTotal) {
		// TODO Auto-generated constructor stub
		this.numeroCuenta = numeroCuenta;
		this.uNIP = NIP;
		this.saldoDisponible = saldoDisponible;
		this.saldoTotal = saldoTotal;
		
	}
	
	public boolean ValidacionNIP(int NIP){
		if(NIP==uNIP) {
			return true;
		}else {
			return false;
		}
	}
	
	public double SaldoDisponible() {
		return saldoDisponible;
	}
	
	public double SaldoTotal() {
		return saldoTotal;
	}
	
	public void Abonar(double monto) {
		saldoTotal = saldoTotal + monto;
	}
	
	public void Retirar(double monto) {
		saldoDisponible -= monto;
		saldoTotal -= monto;
	}
	
	public int ObtenerNumeroCuenta() {
		return numeroCuenta;
	}

}
