/**
 * 
 * @author lukas
 * Repraesentiert die Rechenoperation: Addieren
 *
 */
public class Addition implements Rechenoperation {
	
	private double summand;
	
	/**
	 * Speichert den uebergebenen Summanden
	 * @param summand Summand fuer die Addition
	 */
	public Addition(double summand) {
		this.summand=summand;
	}
	
	public double berechne(double x) {
		return x+=summand;
	}
}
