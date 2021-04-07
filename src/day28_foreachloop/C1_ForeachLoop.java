package day28_foreachloop;

public class C1_ForeachLoop {
	
	public static void main(String[] args) {
		
		// bir arrayin elemanlarýnýn for loop ile yazdiralim
		
		int arr[] = {2, 4,6, 8, 10, 12 };
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// index gerek yok ise, tüm elemeanlari sira ile yazdýramamýz yeterli ise for each loop kullanýrýz.
		// for each loop daha kolay kod yazmamýzý saðlar.
	   
		// each ==> her bir demek 
        // for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
        // for each loop'da baslangic degeri YOKTUR, bitis degeri YOKTUR, index YOKTUR
		
		System.out.println();
		
		for (int w: arr) {
			System.out.print(w + " ");
		}
		
		
		
		
	}

}
