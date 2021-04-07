package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	         /*
	            Eger kodumuzu yazdigimizda birden fazla exception ile iliþkili durum olusuyorsa icice try-catch bloklari olusturabiliriz.
	            Bu ornekte ilk once dosyayi okutmak istedik. Java "Ya dosyayi bulamazsam ? " diye bizden yardim istedi. 
	            Biz de try-catch blogu ile FileNotFoundException ile handle etmesinde yardimci olduk. 
	            Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "ya dosyayi okuyamazsam " diye yardim istedi.
	             Biz de try-catch blogu ile handle etmesinde yardimci olduk. 
	           */
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\gmzed\\eclipse-workspace\\wintertr\\src\\day39_exceptions\\File");
		
			int k =0;
			try {
				while((k=fis.read()) !=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {  // dosyalarla ilgili genel yazma ve okuma sorunlarini handle eder.
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}

		System.out.println("kod bloke olmamis");

		
		// FileNotFoundException  IS A   IOException
	}

}
