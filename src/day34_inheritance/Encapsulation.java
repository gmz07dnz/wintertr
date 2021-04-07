package day34_inheritance;

public class Encapsulation {

	private String okulIsmi="Yildiz Koleji";
    private boolean okulAcikMi=true;
    private int okulHesapNo=12345;
    
    
    public String getOkulIsmi() {
    	return okulIsmi;
    }
    
    public int getOkulHesapNo() {
    	return okulHesapNo;
    }
    
    public boolean isOkulAcikMi() {
    	return okulAcikMi;
    }
    
    public void setOkulIsmi(String okulIsmi) {
    	this.okulIsmi =okulIsmi;  // Disardan gelen okul ismini bu classtaki okul ismine atar. Obje uzerinden oldugu icin bu class'daki orj degeri degistirmez. Objedekini degistirir
    }
    
    public void setOkulAcikMi(boolean  okulAcikMi) {
    	this.okulAcikMi = okulAcikMi;
    }
    
    
    public void setOkulHesapNo(int okulHesapNo) {
    	this.okulHesapNo =okulHesapNo;
    }
}
