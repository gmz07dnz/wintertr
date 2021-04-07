package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		
		/*
		iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		*/
		
		String arr1[] = {"Ali", "Can", "Ayse", "Seher"};
		String arr2[] = {"Ali", "Veli", "Mesut", "Seher","Sedat"};
		
		// ortak elemanlarý koymak için list olusturalim
		List<String> ortakEleman = new ArrayList<>();
		
		for (String w : arr1) {
			for(String j : arr2) {
				if(w.equals(j)) {
					ortakEleman.add(w);
				}
			}
		}
		
		if(ortakEleman.isEmpty()) {
			System.out.println("Ortak eleman yok");
		}else {
			System.out.println(ortakEleman);
		}
		
		
		

	}

}
