package day42_abstractions;

public class C1_final {
	
	final static int SAYI=10;
	
	/*
	    Instance bir variable'i final ve static yaparsaniz java onu bold yapar. Biz de buyuk harfle yazariz.
	     
	 */
	
	String isim;
	
	/*
	     Instance  variable'lar initialize edilmek zorunda deðil. Deger atamazsak da java default value verir.
	     final variable'larin degeri sonradan degistirilmedigi için initialize etmek zorundayiz. Aksi takdirde manasiz olur.
	 */
	
	public static void main(String[] args) {
		
		System.out.println(SAYI); // 10
		
		
	}
	
	public void deneme() {
		System.out.println("deneme yapiyoruz");
	}
	
	final public void deneme2() {
		System.out.println("deneme yapiyoruz");
	}
	
	/*
	   final class yaptigimizda inherit edilemez
	 */
	

}
