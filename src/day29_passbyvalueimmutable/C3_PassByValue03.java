package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		
		degistirFor(list);
		System.out.println(list);  // [10, 11, 12]
		degistirSet(list);
		System.out.println(list); // [13, 14, 15]


	}

	public static void degistirSet(List<Integer> list) {
		
		for(int i= 0; i<list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		
		System.out.println(list);
	}

	public static void degistirFor(List<Integer> list) {
	
		for(int w: list ) {
			w=w+3;
			System.out.print(w + " ");
		}
		System.out.println();
		System.out.println(list);
		
	}

}
