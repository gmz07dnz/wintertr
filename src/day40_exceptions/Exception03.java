package day40_exceptions;

public class Exception03 {

	public static void main(String[] args) {
		
		int arr[] = {1,4,7,8};
		
		try {
		System.out.println(arr[20]);
		
		}catch(ArrayIndexOutOfBoundsException e) {  // catch blogu olmazsa exception atar, app durur ama finally blok calisir. Yani finally blok da calisir sonra kod bloke olur
			e.printStackTrace();                                                //  catch blogu olursa exception handle edilir,, app calisir  ve  finally blok calisir.
		} finally {
			System.out.println("Ne olursa olsun bu satir yazilsin");
		}
	
	/*
	   finally blogu try - catch blogu ile ya da sadece try blogu ile calisir.
	   finally blok her durumda calisir. Ongordugum bir exception olsun ya da olmasin calisir
	   
	 */
	
	
	
	}
}
