package day28_foreachloop;

import java.util.ArrayList;

import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		// verilen bir array'deki tum elemanlari bir listeye aktaran bir method yaziniz
		
		String arr[] = { "Ali", "Ayse", "Fatma" };
		List<String> list = listeyeCevir(arr);

		list.add(0, "Bu is bu kadar");
		list.remove(1);
		System.out.println(list);
	}

	public static List<String> listeyeCevir(String[] arr) {    // listeyeCevir methodu -> List<String> list e assign edildiginden List<String> return edecek
	
		List<String> geciciList = new ArrayList<>();
		
		for(String w : arr) {
			geciciList.add(w);
		}
		return geciciList;
	}

}
