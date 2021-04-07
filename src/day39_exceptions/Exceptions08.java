package day39_exceptions;

import java.util.Scanner;

public class Exceptions08 {

	 /* 
	  Kullanicidan carpma yapmak icin bir String isteyin. 
	  Kullanicinin girdigi String sadece sayilardan olusuyorsa  sayiyi 2 ile carpip sonucu yazdirin.
	  Kullanici sayilardan olusmayan bir String girerse 
	  “Girdiginiz String sayiya cevrilemez” yazdirin.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String str = scan.nextLine();
		
		
//		if(str.replaceAll("\\d", "").length() == 0) {
//			int sayi = Integer.parseInt(str);
//			int product = sayi*2;
//			System.out.println(product);
//		}else {
//			System.out.println("Girdiginiz String sayiya cevrilemez");
//		}
		
		
		try {
		int sayi = Integer.parseInt(str);
		int product = sayi*2;
		System.out.println(product);
		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez");
		}
		
		scan.close();

	}

}
