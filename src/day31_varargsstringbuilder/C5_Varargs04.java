package day31_varargsstringbuilder;


import java.util.ArrayList;
import java.util.List;


public class C5_Varargs04 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		// toplama(list); varargs length'de esnek oldugu icin list'e benzer ama list degildir
		
		int arr[] = {10, 20, 30};
		toplama(arr);
		
		// kullanicidan deger alarak varags calistirmak istiyorsak, girilen degerleri bir array'e kaydetmeliyiz.
		// bunun icin kullanicidan aldiginiz degerleri esnek oldugu icin bir list'e koyariz.
		// Sonra list'i array'e donustruruz

	}
	
	public static void toplama(int... i) { 
		int sum = 0;
		for (int w: i) {
			sum+=w;
		}
		System.out.println("toplam: "+ sum);
	}

}
