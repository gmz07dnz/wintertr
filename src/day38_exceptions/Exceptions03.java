package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		
		// try- catch blogýndaki e nin gorevi
		
		int sayi1 = 10;
		 int sayi2 = 0;
				   
		  //  Exceptions01 exp = new Exceptions01();
	 	 // Exceptions01 hem class adi, hem de exp obj için data type 
		      
		       try {  
				        System.out.println("Bolme isleminin sonucu: " + (sayi1 /sayi2));  
				        } catch (ArithmeticException e) {
				        	// 1. message
				        	System.out.println("Sayiyi 0'a bolemezsin");
				        	
				        	// 2.message
				        	System.out.println(e);    // java.lang.ArithmeticException: / by zero =>  // bu durumda hem java'ya sorunu yazmasi icin firsat vermis
				                                                                                                                                             // hem de aplication'i bloke etmemis oluruz
				        	// 3. message
				        	System.out.println(e.getMessage());  // / by zero
				        	
				        	// 4. message => Hatanýn tamamýný verir
				        	e.printStackTrace();  // java.lang.ArithmeticException: / by zero
				                                               // at day38_exceptions.Exceptions03.main(Exceptions03.java:16)

				        	
				        } 
		       
		    // ArithmeticException java'da bir class ve e objesi icin data turu
	       // e ise ArithmeticException class'indan olusturdugumuz objenin adi
	       // o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir    
		       

	}

}
