package beispiel3_zinsberechnung;

public class ZinsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Der Zinsertrag beträgt: "+Zinsberechnung(1_000.0 , 2.25));
		System.out.println("Der Zinsertrag beträgt: "+Zinsberechnung(3_000.0 , 2.50));
		System.out.println("Der Zinsertrag beträgt: "+Zinsberechnung(10_000.0 , 0.15));
		
	}
	
	public static double Zinsberechnung(double kontostand, double zinsen){
	
	double zinsertrag = (kontostand*zinsen)/100;
	return zinsertrag;
	}
}
