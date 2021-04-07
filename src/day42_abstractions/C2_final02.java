package day42_abstractions;

public class C2_final02 extends C1_final{



	public static void main(String[] args) {
		
		System.out.println(C1_final.SAYI); // 10
		
		// C1_final.SAYI += 20;  => final old için deðiþtirilemez. CTE verir
		
		C2_final02 obj = new C2_final02();  // variable = data turu         method = > constructor
		obj.deneme();
	

	}
	
	@Override
	public void deneme() {
	System.out.println("Child class'taki overriding deneme");
	}
	
	
//	public void deneme2() {              ==> Cannot override the final method from C1_final
//		System.out.println("Child class'taki overriding deneme");
//		}
	
	

}
