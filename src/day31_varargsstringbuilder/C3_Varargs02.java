package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		
		// istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yaziniz.
		// var -- variety args -- arguments
		
		toplama (2,5);
		toplama (10,5,15);
		toplama (4,5,9,7);
		
		
		
	}
	
	public static void toplama(int... i) {  // data turunden sonra gelen "..." varargs temsil eder
		int sum = 0;
		for (int w: i) {
			sum+=w;
		}
		System.out.println("toplam: "+ sum);
	}

}
