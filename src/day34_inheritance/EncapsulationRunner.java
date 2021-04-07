package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {

		Encapsulation obj1 = new Encapsulation();

		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji
		System.out.println(obj1.getOkulHesapNo());
		System.out.println(obj1.isOkulAcikMi());
		obj1.setOkulIsmi("Gamze Koleji" );
		System.out.println(obj1.getOkulIsmi()); // Gamze Koleji
		
		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmi());  // Yildiz Koleji
	}

}
