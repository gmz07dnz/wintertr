package day28_foreachloop;

public class C2_ForEachLoop2 {
	
	public static void main(String[] args) {
		
		
		// Bir integer array olusturunuz ve bu arraydeki tum sayýlarýn carpýmýný for each kullanarak bulunuz
		
		int arr[] = {1,2,1,2,4,3,1,2};
		
		int product = 1;
		
		for (int w : arr) {
			product = product*w;
		}
		 System.out.println(product);
	}

}

