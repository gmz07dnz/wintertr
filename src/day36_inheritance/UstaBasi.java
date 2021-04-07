package day36_inheritance;


public class UstaBasi extends Isci{
	
	public String bolum ="takimhane";
	public int sorOldIsciSayisi =10;

	public static void main(String[] args) {
	
		UstaBasi ub1 = new UstaBasi();
		
		// objyi torunda olusturunca 3 class'a da ulasabiliyoruz
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIsciSayisi);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
	    //	UstaBasi ub2= new UstaBasi();  
		// ustabasi is a Isci, Isci is a Personel
		// Daha geniþ data type kullanmanýn avantajý; kapsamýn daha geniþ olmasý
		//  Daha geniþ data type kullanmanýn dezavantajý ;sectiðimiz data türü ve parent'ýna ulasabiliyoruz
		
		Isci ub2= new UstaBasi();  // ustabasi is a Isci
//		List<String> list = new ArrayList<>();  // list ArrayList'in parent'idir.
		
		System.out.println(ub2.department); // Isci class'ýndan
		System.out.println(ub2.izindeMi);  // Personel class'ýndan
		
		Personel ub3 = new UstaBasi();  // ustabasi is a Personel => Sadece personel'e ulasýlabiliyor
		System.out.println(ub3.isim); //  Personel class'ýndan

		
	}

}
