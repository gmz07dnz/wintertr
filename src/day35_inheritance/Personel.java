package day35_inheritance;

public class Personel {

	
	/*
	Her class default contructor'a sahiptir.
	Default contructor'in parametresi yoktur.
	Biz parametreli ve ya parametresiz bir constructor olusturdugumuzda default constructor silinir.
    Biz sadece  parametreli constructor olusturursak java default olani sildigi icin parametresiz constructor kalmaz.
    Dolayisiyla parametreli bir constructor olusturdugumuzda default constructor yerine de parametresiz bir constructor 
    olusturmamiz gerekir.
	*/
	
	
	public String isim ;
	public int sayi;
	
	
	public Personel() {  // parametresiz bir cons olusturdum
		//  super();          // eger içinde bulundugumuz child class degilse super() keywordunu silebiliriz
		
		System.out.println("Personel parametresiz constructor calisti");
	}


	public Personel(String isim, int sayi) {
		// super();
		System.out.println("Personel parametreli constructor calisti");
		this.isim =isim;
		this.sayi =sayi;
	}


	
	
	
	

	
}
