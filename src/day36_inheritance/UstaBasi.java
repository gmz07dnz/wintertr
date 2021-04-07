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
		// Daha geni� data type kullanman�n avantaj�; kapsam�n daha geni� olmas�
		//  Daha geni� data type kullanman�n dezavantaj� ;secti�imiz data t�r� ve parent'�na ulasabiliyoruz
		
		Isci ub2= new UstaBasi();  // ustabasi is a Isci
//		List<String> list = new ArrayList<>();  // list ArrayList'in parent'idir.
		
		System.out.println(ub2.department); // Isci class'�ndan
		System.out.println(ub2.izindeMi);  // Personel class'�ndan
		
		Personel ub3 = new UstaBasi();  // ustabasi is a Personel => Sadece personel'e ulas�labiliyor
		System.out.println(ub3.isim); //  Personel class'�ndan

		
	}

}
