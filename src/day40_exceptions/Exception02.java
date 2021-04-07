package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	
	public static void main(String[] args) throws FileNotFoundException, IOException{


		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream("C:\\Users\\gmzed\\eclipse-workspace\\wintertr\\src\\day39_exceptions\\File");

		// try- catch blogu exception ile handle etmekde kullanýlýr. 
		// throws keywordu ise sadece declaration2dir. Dolayisiyla throws kulla nilan bir methodda exception olusursa KOD BLOKE OLUR
		
		int k =0;
		
		while((k =fis.read() )!= -1) {
			System.out.println((char) k);
		}
		
		// Eger birden fazla exception için throws keywordu kullanacaksak yazacagimiz exception'larin arasindaki iliski ve siralama onemli olur.
		// eger yazdigimiz exception'lar arasýnda parent-child iliþkisi varsa once child exception yazilmalidir ama tavsiye edilmez. 
        //  Cunku parent exception tum durumlari kapsayacaktir. (Hedef farkli durumlar icin aciklama yazip  handle etmek olmadigindan, bir exception’in calismasi yeterlidir)
		
		
		
		
	}

}
