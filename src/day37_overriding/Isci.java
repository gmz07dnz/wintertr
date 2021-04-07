package day37_overriding;

public class Isci extends Personel{

	public String bolum = "Kaynak Atolyesi";
	public int maas = 5000;
	public String isim = "Mesut";
	
	
	public int maasHesapla () {
		return 30*8*15;
	}
	
	public void mesai() {
		System.out.println("Ýsciler gunluk 8 sa calisir ");
	}
	
	

	
	
	
	
	
	
}
