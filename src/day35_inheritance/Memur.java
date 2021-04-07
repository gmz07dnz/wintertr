package day35_inheritance;

public class Memur extends Personel {

	public int maas;
	
	public Memur() {
	super();        //  => Parent class'a gider, parametresiz const goturur. Extends varsa yazmasak da calýsýr.
		System.out.println("Child Class  parametresiz constructor calisti");
	}
	
	
	/*
	 => super() => default  const gibidir. Yazmasak da extends yapýlmýþsa çalýþýr. Ancak yerine baþka bir keyword yazarsak etkisiz hale gelir.
	=>  super() => parent'a goturur
	=> this() => içinde bulundugu class'daki constructor call
	 */
	

//	public Memur(int maas) {
//		super();
//		System.out.println("Child Class  parametreliconstructor calisti");  //Personel parametresiz constructor calisti
//		                                                                                                                   //Child Class  parametreliconstructor calisti
//	}


	public Memur(int maas) {
		super("Seher",6000);
		System.out.println("Child Class  parametreliconstructor calisti");  // Personel parametreli constructor calisti
		 this.maas =maas;                                                                                                                 //Child Class  parametreliconstructor calisti
	}
	
	
	

	public static void main(String[] args) {
		
		Memur obj1 = new Memur();  // Personel parametresiz constructor calisti
	                                                          //	Child Class  parametresiz constructor calisti
		System.out.println(obj1.isim); // null
		
		Memur obj2= new Memur(2400);
		System.out.println(obj2.isim); // seher 
		System.out.println(obj2.sayi);  // 6000
		System.out.println(obj2.maas); // 2400
		
		

	}

}
