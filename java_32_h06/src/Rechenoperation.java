/**
 * 
 * @author markus, lukas
 * Interface, das eine Berechnungs-methode vorschreibt
 * (fuer Addition, Quadrat, Quadratwurzel und beliebige andere)
 */
@FunctionalInterface
public interface Rechenoperation {

	/**
	 * 
	 * @param x Wert vor der Rechenoperation
	 * @return Wert nach der Rechenoperation
	 */
	public double berechne(double x); 
}
