package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
	
		/*
		   Icice try-catch yerine bir tane try ve multiple catch blogu kullanabilliriz
		   Ancak bu durumda yazdigimiz exceptionlar arasinda parent-child iliskisi varsa once child class'i yazmaliyiz aksi takdirde 
		   yani once parent yazilirsa child'a iþ kalmaz.
		   Java erisilmez  catch blogu diyerek CTE verir
		 */
		
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\gmzed\\eclipse-workspace\\wintertr\\src\\day39_exceptions\\File");
		
			int k =0;
				while((k=fis.read()) !=-1) {  // hicbirsey gormeyince k'ya -1 veriyor
					System.out.print((char)k);
				}
		fis.close();
		} catch (FileNotFoundException e) {  // dosyalarla ilgili genel yazma ve okuma sorunlarini handle eder.
				
				e.printStackTrace();
			}  catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
