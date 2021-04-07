package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

          	/*
	            Kullanicidan yasini girmesini isteyin. 
	            Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
	         */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (yas>=0) {
			System.out.println("Girdiginiz yas: " + yas);
		}else {
			throw new IllegalArgumentException();
		}
		*/

		// Java'ya bir exception throw ettirmek için "throw" ve "new" keyword'leri kullanýlýr 
		// Bu sekilde yazdigimizda java exception throw eder ama kodumuz da bloke olmus olur. 
		// Bloke olmasýný engellemek istersek kodu try - catch ile surround yapailiriz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		try {
		if (yas>=0) {
			System.out.println("Girdiginiz yas: " + yas);
		}else {
			throw new IllegalArgumentException();
		} 
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		
		System.out.println("kod bloke olmamis");
		
	
		scan.close();
	}

}
