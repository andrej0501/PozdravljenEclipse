// Definiramo razred, ki razširi razred Steklenica in implementira vmestnik AlkoholnaPijaca
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca{
	
	// Vse lastnosti/atributi, deklarirane v nadrazredu se prenesejo
	// Deklariramo samo nove
	private boolean jePovratna;
	private String znamka;
	private int odstotekAlkohola;
	
	//Deklariramo konstruktor - enak kot pri nadrazredu (z kot znamka, a kot alkohol, p kot povratna, k - količina, ki je definirana že v Stekelnica)
	/**
	 * @param a stopnja alkohola
	 * @param z znamka piva
	 */
	public PivskaSteklenica(int a, String z) {
		
		// Pred super ne sme biti nič drugega v konstruktorju
		// Pokličemo konstruktor nadrazreda Steklenica z rezervirano besedo super
		// Vhodi: stopnja alkohola, znamka piva
		super(500, "Pivo");
		
		// Določimo ostale lastnosti
		jePovratna = true;
		setZnamka(z);
		odstotekAlkohola = a;
	}	//konec 2. konstruktorja
	
	// Deklariramo nov konstruktor
	public PivskaSteklenica(int a, String z, int k, boolean p){
		
		// Pokličemo konstruktor nadrazreda
		// Vhodi: stopnja alkohola, znamka piva, kapaciteta, ali je povratna
		super(k, "Pivo");
		
		// Določimo ostale lastnosti
		jePovratna = p;
		setZnamka(z);
		odstotekAlkohola = a;
	} 	//konec 2. konstruktorja	
	
	// Deklariramo metodo getStopnjaAlkohola, ki jo predpisuje vmesnik AlkoholnaPijaca
	public int getStopnjaAlkohola() {
		//vrnemo odstotek alkohola
		return odstotekAlkohola;
	}

	/**
	 * @param znamka bila v steklenici
	 */
	public String getZnamka() {
		return znamka;
	}

	/**
	 * @param znamka piva ki naj bo v steklenici
	 * 	 this dostopa do spremenljivk v istem razredu( enako kot super dostopa do konstruktorja nadrazreda)
	 */
	public void setZnamka(String znamka) {
		this.znamka = znamka;
	}
}