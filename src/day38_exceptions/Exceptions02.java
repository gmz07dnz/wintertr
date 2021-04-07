package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

	// Kullanýcýdan 2 tam sayý alýn  ve bolumlerini yazdýrýn
		// 100 kere yapalým 
		
		Scanner scan = new Scanner(System.in);
		
		int count =1;
		while(count<101) {
			
			System.out.println("Lütfen bolunecek tamsayýyý yazin");
	        int sayi1 = scan.nextInt();
	        System.out.println("Lütfen kaca bolmek istediginiz sayýyý yazýn");
	        int sayi2 = scan.nextInt();
	       System.out.println("Islem no: "+ count);
	       
	        // Exception handle etmek için try- catch blogu kullanýrýz
	        try {
	        System.out.println("Bolme isleminin sonucu: " + (sayi1 /sayi2));  // risk 0 ile bolunmektir
	        } catch (ArithmeticException e) {
	        	System.out.println("Sayiyi 0'a bolemezsin");
	        }
	        
	        count++;
		}
	
        /*
         Eger handle etmesi için bir yol göstermezsek java exception ile karsilastiginda calismayý durdurur(stop execution)
         throws exception (exception firlatir) ve prob kaynagýný bize gosterir.
         
         tüm app durur
         Müsterinin kullandýgý bir durum için u kabul edilemez.
         Bunun için kod yazan kiþi muhtemel hatakarý ongormeli ve Java'ya bu sorunla handle edilebilmesi için yol gosterilmelidir
         
         
         
         */
    
        
       scan.close();

	}

}
