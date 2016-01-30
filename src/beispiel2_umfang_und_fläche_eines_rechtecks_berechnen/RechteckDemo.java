package beispiel2_umfang_und_fläche_eines_rechtecks_berechnen;

public class RechteckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int breite = 30;
		int laenge = 20;
		
		int umfang = (laenge + breite)*2;
		int flaeche = laenge * breite;
		
		System.out.println("Die Fläche des Rechteckes beträgt: "+flaeche);
		System.out.println("Der Umfang des Rechteckes beträgt: "+umfang);
		
	}

}
