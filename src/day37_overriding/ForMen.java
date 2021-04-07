package day37_overriding;

public class ForMen extends Isci {

	public String sorumluOldBolum = "bakim";
	public String isim = "Ali Can";
	
	public static void main(String[] args) {
		
		// Inheritance'da data turu olarak class ismi kullanýmý
		/*
		 Bir class'da obje uretirken data type olarak kendisini ya da parent'larýný kullanabiliriz. 
		 Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri alacagini anlamak icin once Data turu olan class'a gideriz
		 orada aradigimiz variable varsa kullaniriz, yoksa  parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz
		 */
		
		ForMen fr1 = new ForMen();
		// fr1 objesini kullanarak hangi class'larýn variable'larý gorulebilir.
		fr1.sorumluOldBolum = "marangozhane";
		fr1.maas = 10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum + " " + fr1.maas); // Ali Can marangozhane 10000
		
		Isci fr2 = new ForMen();  // Data type isci secildigi icin isci ve ustunu gorebiliriz
		fr2.bolum = "Kaynak atolyesi";
		System.out.println(fr2.isim + " " + fr2.bolum + " " + fr2.maas); // Mesut Kaynak atolyesi 5000
		
		Personel fr3 = new ForMen();
				System.out.println(fr3.isim); // Emre
		
	}
	
	
}
