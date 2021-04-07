package day31_varargsstringbuilder;

public class C2_Varargs {

	public static void main(String[] args) {
		//Verilen iki sayýyý toplayan ve sonucu yazdýran bir method yazýnýz
		int sayi1= 10;
		int sayi2 =20;
		int sayi3 =21;
		
		toplama(sayi1, sayi2);

		//Verilen uc sayýyý toplayan ve sonucu yazdýran bir method yazýnýz
		toplama(sayi1, sayi2,sayi3);
		
		// oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		toplama(2,3); // => iki sayinin toplamý methodu calýsýr
		toplama (2,5,8); //   => iki sayinin toplamý methodu calýsýr
		
		// istedigimiz kadar sayiyi yazabilecigimiz methodu olusturabilmemiz icin Java varargs olusturmus
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami " +(sayi1+sayi2+ sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
	System.out.println("iki sayinin toplami " +(sayi1+sayi2));
		
	}

}
