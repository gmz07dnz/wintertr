package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		// Kullanýcýdan 2 tam sayý alýn  ve bolumlerini yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bolunecek tamsayýyý yazin");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen kaca bolmek istediginiz sayýyý yazýn");
        int sayi2 = scan.nextInt();
     
        // Exception handle etmek için try- catch blogu kullanýrýz
        try {
        System.out.println("Bolme isleminin sonucu: " + (sayi1 /sayi2));  // risk 0 ile bolunmektir
        } catch (ArithmeticException e) {
        	System.out.println("Sayiyi 0'a bolemezsin");
        }
        
        /*
          0 ile boldugumuz de exception atar
          Exception in thread "main" java.lang.ArithmeticException: / by zero
	      at day38_exceptions.Exceptions01.main(Exceptions01.java:17)
	      
	      => Exception tür  -> ArithmeticException
	      => Exception kaynak -> by zero
	      => Exception yer -> at day38_exceptions.Exceptions01.main(Exceptions01.java:17)
	      belirtir.
          
         */
        
       scan.close();
        
        
     
        
	}

}
