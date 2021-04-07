package day37_overriding;

public class Gecici�sci extends Isci {

	public String calistigiBolum = "Yemekhane";
	
	
	public static void main(String[] args) {
		
		// Overriding 
		// bir child class'da parent class'dan inherit edilen methodu degi�tirmeye overriding denir
		
		Gecici�sci gi1 = new Gecici�sci();
		System.out.println(gi1.maasHesapla()); // 2400
		gi1.mesai(); // Gecici isciler haftada 25 sa calisir
		
		
	}
	
	/*
	  Overriding yapmak i�in parent class'daki method signature ile child class'da bir method olusturulur. 
	  Sadece body de�i�ir
	  parent class'daki method child i�in gecersiz olur.
	 */
	
	// annotation olmasi ile olmamasi arasindaki fark
    // annotation sadece bir aciklama degildir
    // override yaptigimiz method'u surekli kontrol eder ve parent class'daki  overridden method signature'i degistirilirse CTE verdirir
    
    // eger override edilen parent class'daki method(overriden)'un da
    // calismasini istiyorsak overriding method'a super.overridenMethodIsmi yazariz
    // eger overriding method'da super. yazilmazsa overridden method calismaz. 

	/*
	 Access modifier 
	 Child class parent class'� s�n�rland�ramaz. 
	 Yani, overriding method'un access modifier'� overridden access modifier'dan daha dar olamaz.
	 */
	
	/*
	  Return Type
	  overridden method'un return type primitive ve ya void ise overriding method'un return type ayni olmali
	  Eger return type primitive degilse;  (overriding method'un return type ) IS -A (overridden method'un return type )
	  
	 */
	public int maasHesapla () {
		return 30*8*10;
	}

	@Override  // 
	public void mesai() {
	//	super.mesai();
		System.out.println("Gecici isciler haftada 25 sa calisir");
	}
	
	
}
