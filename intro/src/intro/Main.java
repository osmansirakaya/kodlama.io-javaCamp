package intro;

public class Main {
	
	// main java'da baslangic metodu'dur
	
	public static void main(String[] args) {
	System.out.println("hello kodlama.io");
	
	// de�i�ken isimleri camelCase yaz�l�r.
	String ortaMetin = "ilginizi �ekebilir";
	String altMetin = "Vade s�resi";
	
	System.out.println(ortaMetin);
	
	int vade = 12;
	double dolarDun = 18.25;
	double dolarBugun = 18.20;
	
	boolean dolarDustuMu = true;
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) { // true
		okYonu = "down.jpg";
		System.out.println(okYonu);
	}else if (dolarBugun>dolarDun ) {
		okYonu = "up.jpg";
		System.out.println(okYonu);
	}else {
		okYonu = "equal.png";
		System.out.println(okYonu);
	}
	
	// array 
	
	String [] Krediler = {"h�zl� kredi", "maa��m halkbanktan","mutlu emekli"};
	
	for (int i = 0; i < Krediler.length; i++) {
		System.out.println(Krediler[i]);
	}
	
	
	
	
	
	
	
	
    }
}
