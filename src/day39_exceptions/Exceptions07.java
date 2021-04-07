package day39_exceptions;

public class Exceptions07 {

	public static void main(String[] args) {
		
		
		int sayi = 10;
		System.out.println(sayi);
		
		String str =  "1234";
		System.out.println(str+10); // 123410
		
		int strSayi = Integer.parseInt(str);
		System.out.println(strSayi + 10); // 1244
		
		String str2 =  "12d34da";
        System.out.println( Integer.parseInt(str2)); // NumberFormatException  -> harfler integera donusturulemediginden
        /*
          Eger tamamen sayilardan olusmayan String'i integer'a cevirmeye calisirsaniz Java NumberFormatException atar
         */
		
		Object sayi2 = 40;
		String sayiStr = (String)sayi2;  // explicit narrowing  => ClassCastException
		System.out.println(sayiStr);
		
		/*
		  Data turlerini casting yaparken uygun olmayan islem yaparsanýz Java ClassCastException atar
		 */

	}

}
