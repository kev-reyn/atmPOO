

/**
 * @author ItKevinR
 *
 * 03:57:19 AM
 */
public class DispensadorEfectivo {

	public static int billetesDeCien = 2000;
	public static int billetesDeDocientos = 1500;
	public static int billetesDeQuinientos = 1000;
	private int cien;
	private int docientos;
	private int quinientos;
	
	public DispensadorEfectivo() {
		// TODO Auto-generated constructor stub
		cien=billetesDeCien;
		docientos=billetesDeDocientos;
		quinientos=billetesDeQuinientos;
	}
	
	public void dispensarEfectivo(int monto) {
		int billetesRequeridosDe500 = monto/500;
		int b2 = monto - (billetesRequeridosDe500*500);
		int billetesRequeridosDe200 = b2/200;
		int b3 = b2 - (billetesRequeridosDe200*200);
		int billetesRequeridosDe100 = b3;
	}

}
