package day31_varargsstringbuilder;

public class C4_Varargs03 {

	/*
	  1) ir methodda varags varsa parameter olarak sonda olmalýdýr.
	 */
	public static void main(String[] args) {
		
		toplama (2,5);
		toplama (10,5,15);
		toplama (4,5,9,7);

	}
	
	public static void toplama(int sayi1,int... i) { 
		int sum = 0;
		for (int w: i) {
			sum+=w;
		}
		System.out.println("toplam: "+ (sum+sayi1));
	}

}
