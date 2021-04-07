package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		// Kullan�c�dan 2 tam say� al�n  ve bolumlerini yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bolunecek tamsay�y� yazin");
        int sayi1 = scan.nextInt();
        System.out.println("L�tfen kaca bolmek istediginiz say�y� yaz�n");
        int sayi2 = scan.nextInt();
     
        // Exception handle etmek i�in try- catch blogu kullan�r�z
        try {
        System.out.println("Bolme isleminin sonucu: " + (sayi1 /sayi2));  // risk 0 ile bolunmektir
        } catch (ArithmeticException e) {
        	System.out.println("Sayiyi 0'a bolemezsin");
        }
        
        /*
          0 ile boldugumuz de exception atar
          Exception in thread "main" java.lang.ArithmeticException: / by zero
	      at day38_exceptions.Exceptions01.main(Exceptions01.java:17)
	      
	      => Exception t�r  -> ArithmeticException
	      => Exception kaynak -> by zero
	      => Exception yer -> at day38_exceptions.Exceptions01.main(Exceptions01.java:17)
	      belirtir.
          
         */
        
       scan.close();
        
        
     
        
	}

}
