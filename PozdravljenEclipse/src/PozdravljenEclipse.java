/**
 * 
 */

/**
 * @author Andrej
 *
 */
public class PozdravljenEclipse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Izpišemo pozdrav
		System.out.println("Pozdravljen Eclipse!");
	
		//ustvarimo pivsko steklenico
		PivskaSteklenica ps= new PivskaSteklenica(5, "Laško");
		//odpremo
		ps.odpri();
		//izpraznemo steklenico
		
		try {
			ps.izprazni(100);
			System.out.println("Iz steklenice " + ps.getZnamka() + " izpraznimo 100 ml piva.");
			System.out.println("Ostane še " + ps.getKolicinaVsebine()) + "ml piva.";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Prišlo je do napake pri praznenju steklenice!");
		}
		
				
				
	}
	
	//ustvarimo pivsko steklenico
	

}
