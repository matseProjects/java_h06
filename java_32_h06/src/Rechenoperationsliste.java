import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author markus, lukas
 * Repraesentiert eine Liste von Rechenoperationen
 */
public class Rechenoperationsliste {
	/**
	 * Liste von Rechenoperationen
	 */
	private ArrayList<Rechenoperation> operationList; 
	
	/**
	 * Inititalisiert die Liste
	 */
	public Rechenoperationsliste() {
		operationList = new ArrayList<>();
	}
	
	/**
	 * Fuegt die angegebene Operation zur Liste
	 * @param operation 
	 */
	public void add(Rechenoperation operation) {
		operationList.add(operation);
	}
	
	/**
	 * Fuehrt die Rechenoperationen schrittweise fuer jedes Element des Feldes aus
	 * 
	 * @param field ,Feld, auf das die Rechenoperationen angewendet werden sollen
	 * @return field , Feld, nach der Ausfuehrung der Rechenoperationen
	 */
	public double[] transform(double[] field) {
		double[] fieldCopy = new double[field.length];
		System.arraycopy(field, 0, fieldCopy, 0, field.length);
		for(int counter=0; counter<field.length;counter++) {
			for (Rechenoperation operation : operationList) {
				fieldCopy[counter]=operation.berechne(fieldCopy[counter]);
			}
		}
		//operationList.clear();
		return fieldCopy;
	}
	
	public static void main(String[] args){
		
		double[] ausgangsfeld = { 1, 3, 5, 6 };  
		Rechenoperationsliste r = new Rechenoperationsliste();  
		// Berechnet die Funktion (x^2)+2  
		r.add(new Quadrat());  
		r.add(new Addition(2));  // Berechnung und Ausgabe 
		 double[] test1 = r.transform(ausgangsfeld);   // ergibt {3,11,27,38}  
		System.out.println(Arrays.toString(test1)); 
		 
		 // fuegt der Rechenoperationsliste eine weitere Rechenoperation hinzu  // und berechnet daher insgesamt Math.sqrt((x^2)+2)    
		 r.add(new Quadratwurzel());  // Berechnung und Ausgabe 
		 double[] test2 = r.transform(ausgangsfeld);  // ergibt { 1.7320508075688772,       //         3.3166247903554,  //    5.196152422706632,  //    6.164414002968976} 
		 System.out.println(Arrays.toString(test2));  
	}
}
