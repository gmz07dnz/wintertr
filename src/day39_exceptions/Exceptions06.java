package day39_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions06 {

	public static void main(String[] args) {
		// List ve array'de varolmayan bir index ile islem yapmak isterseniz 
		// Java IndexOutOfBoundsException verir
		
	
		
		int arr[] = { 1,2,3,4,5};
		
		System.out.println(arr[1]); // 2
		System.out.println(arr[3]); // 4
	//	System.out.println(arr[6]); //  ArrayIndexOutOfBoundsException
		
		List<String> list = new  ArrayList<>();
		list.add("Ali");
		list.add("Veli");
		list.add("Gamze");
		
		System.out.println(list.get(0)); // Veli
		System.out.println(list.get(3));  // IndexOutOfBoundsException
		
		

	}

}
