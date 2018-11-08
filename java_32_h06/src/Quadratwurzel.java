/**
 * 
 * @author lukas
 * Repraesentiert die Rechenoperation: Ziehen der Quadratwurzel
 *
 */
public class Quadratwurzel implements Rechenoperation {

	public double berechne(double x) {
		if(x<0) {
			throw new ArithmeticException(x+ " ist kleiner als 0"); 
		};
		return Math.sqrt(x);
	}
}
