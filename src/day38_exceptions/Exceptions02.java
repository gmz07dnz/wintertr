package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

	// Kullan�c�dan 2 tam say� al�n  ve bolumlerini yazd�r�n
		// 100 kere yapal�m 
		
		Scanner scan = new Scanner(System.in);
		
		int count =1;
		while(count<101) {
			
			System.out.println("L�tfen bolunecek tamsay�y� yazin");
	        int sayi1 = scan.nextInt();
	        System.out.println("L�tfen kaca bolmek istediginiz say�y� yaz�n");
	        int sayi2 = scan.nextInt();
	       System.out.println("Islem no: "+ count);
	       
	        // Exception handle etmek i�in try- catch blogu kullan�r�z
	        try {
	        System.out.println("Bolme isleminin sonucu: " + (sayi1 /sayi2));  // risk 0 ile bolunmektir
	        } catch (ArithmeticException e) {
	        	System.out.println("Sayiyi 0'a bolemezsin");
	        }
	        
	        count++;
		}
	
        /*
         Eger handle etmesi i�in bir yol g�stermezsek java exception ile karsilastiginda calismay� durdurur(stop execution)
         throws exception (exception firlatir) ve prob kaynag�n� bize gosterir.
         
         t�m app durur
         M�sterinin kulland�g� bir durum i�in u kabul edilemez.
         Bunun i�in kod yazan ki�i muhtemel hatakar� ongormeli ve Java'ya bu sorunla handle edilebilmesi i�in yol gosterilmelidir
         
         
         
         */
    
        
       scan.close();

	}

}
