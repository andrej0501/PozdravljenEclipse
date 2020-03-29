// Deklariramo javni razred z imenom Steklenica - vsi razredi so z velikimi začetnicami, spremenljivke so z malimi začetnicami
public class Steklenica {
	
	// Deklariramo lastnosti (spremenljivke) private pomeni da so zasebne spremenljivke, ki jih na ven skrivamo.
	// (private - da se od zunaj ne da spreminjati, String - pomeni, da je niz, ki se imenjuje vrstaVsebine)
	// int - cela števila, spremenljivke so z mali mi začetnicami
	private String vrstaVsebine;
	private int kapaciteta;
	private int kolicinaVsebine;
	private boolean jeOdprta;
	
	// Deklariramo konstruktor s katerim ustvarimo nov objekt tipa Steklenica
	// Vhod: kapaciteta in vrsta vsebine
	// Vrne: nov objekt razreda Steklenica
	public Steklenica(int k, String v){
		
		// Inicializiramo lastnosti
		vrstaVsebine = v;
		kapaciteta = k;
		kolicinaVsebine = k;
		jeOdprta = false;
	}	// Konec konstruktorja
	
	
	// Metoda, ki vrne količino vsebine (imena metod so vedno z malii črkami) Metoda je lahko zasebna ali javna.
	// Vhod: /
	// Izhod: Količina vsebine
	public int getKolicinaVsebine() {
		
		// Vrne vrednost lastnosti kolicinaVsebine
		return kolicinaVsebine;
	}	// konec kolicina vsebine
	
	
	// Javna metoda, ki vrne vrsto vsebine (imena metod so vedno z malii črkami) Metoda je lahko zasebna ali javna.
	// Vhod: /
	// Izhod: vrsta vsebine
	public String getVrstaVsebine() {
		
		// Vrne vrednost lastnosti vrstaVsebine
		return vrstaVsebine;
	}	// konec vrstaVsebine
	
	
	// Metoda za praznjenje steklenice, ki meče izjemo - spremenimo lastnost kolicinaVsebine
	// Vhod: Kolkičina ki jo želimo izprazniti (ki - količina izpraznjena)
	// Izhod: koliko je še ostalo
	public int izprazni(int ki) throws Exception {
		
		// če je steklenica odprta
		if(jeOdprta){
			
			// 1. izpraznimo vsebino
			kolicinaVsebine -= ki;	

			// 2. Preverimo ali je količina negativna. Če je negativna jo damo na 0
			if(kolicinaVsebine < 0){
				
				// postavimo količino vsebine na 0
				kolicinaVsebine = 0;
				// vržemo izjemo - če je odprta
				throw new Exception("V steklenici ni bilo dovolj vode.");
			}	// konec if		
				
		}	// konec if je odprta
				
		// 3. Če je steklenica zaprta
		else {
			
			// Vržemo izjemo - če je zaprta (z throw se izvajanje zaključi tako da za njim ne sme biti ničesar več)
			throw new Exception("Steklenica je zaprta.");
		}	// konec else
		
		// Vrne količino vsebine
		return kolicinaVsebine;
		
	}	// konec izprazni
	
	// Metoda, ki odpre steklenico (metoda odpri() - mora imeti oklepaje ker gre za metodo in ne spremenljivko)
	// Vhod: /
	// Izhod: uspešnost odpiranja
	public	boolean odpri () {
		
		//Spremenimo vrednost lastnosti
		jeOdprta = true;
		
		// V vsakem primeru vrne true
		return true;
		
	}	//konec metode odpri
	
}