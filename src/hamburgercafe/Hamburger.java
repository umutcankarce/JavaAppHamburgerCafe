/* Burger Kralı */
/* HamburgerClass */
package hamburgercafe;
public class Hamburger {
  
 private String adi; 
 private String ekmekCesidi;
 private String etCesidi;
 private double ucret;
 
/* Kurucu Method */
public Hamburger(String adi,String ekmekCesidi,String etCesidi,double ucret){
     this.adi = adi;
     this.ekmekCesidi = ekmekCesidi;
     this.etCesidi = etCesidi;
     this.ucret = ucret;
 }
   public String IlaveUrunAdi1;
    public double IlaveUrunUcret1;

    public String IlaveUrunAdi2;
    public double IlaveUrunUcret2;

    public String IlaveUrunAdi3;
    public double IlaveUrunUcret3;

    public String IlaveUrunAdi4;
    public double IlaveUrunUcret4;
 
 public void EkleIlaveUrun1(String ad, double ucret){
     this.IlaveUrunAdi1 = ad;
     this.IlaveUrunUcret1 = ucret;
 }
 public void EkleIlaveUrun2(String ad, double ucret){
     this.IlaveUrunAdi2 = ad;
     this.IlaveUrunUcret2 = ucret;
 }
 public void EkleIlaveUrun3(String ad, double ucret){
     this.IlaveUrunAdi3 = ad;
     this.IlaveUrunUcret3 = ucret;
 }
 public void EkleIlaveUrun4(String ad, double ucret){
     this.IlaveUrunAdi4 = ad;
     this.IlaveUrunUcret4 = ucret;
 }
 
    public void setAdi(String adi){
        this.adi = adi;
    }
    
    public String getAdi(){
        return this.adi;
    }
    
    public void setEkmekCesidi(String ekmekCesidi){
        this.ekmekCesidi = ekmekCesidi;
    }

    public String getEkmekCesidi(){
        return this.ekmekCesidi;
    }

    public void setEtCesidi(String etCesidi){
        this.etCesidi = etCesidi;
    } 
    
    public String getEtCesidi(){
        return this.etCesidi;
    }

    public void setUcret(double ucret){
        this.ucret = ucret;
    }
    
    public double getUcret(){
        return this.ucret;
    }
    
    
    public double hamburgerBilgileri(){
      double toplamUcret = this.ucret; 
        System.out.println("Hamburger Adı:"+ this.adi + "\nEkmek Çeşidi:"+this.ekmekCesidi+"\nEt Çeşidi:"+this.etCesidi+"\nÜcret:"+this.ucret);
        if (this.IlaveUrunAdi1 != null) {
            toplamUcret += this.IlaveUrunUcret1;
            System.out.println("İlave Ürün:"+ this.IlaveUrunAdi1 + " İlave Ürün Ücret:"+this.IlaveUrunUcret1);
        }
        if (this.IlaveUrunAdi2 != null) {
            toplamUcret += this.IlaveUrunUcret2;
            System.out.println("İlave Ürün:"+ this.IlaveUrunAdi2 + " İlave Ürün Ücret:"+this.IlaveUrunUcret2);
        }
        if (this.IlaveUrunAdi3 != null) {
            toplamUcret += this.IlaveUrunUcret3;
            System.out.println("İlave Ürün:"+ this.IlaveUrunAdi2 + " İlave Ürün Ücret:"+this.IlaveUrunUcret3);
        }
        if (this.IlaveUrunAdi4 != null) {
            toplamUcret += this.IlaveUrunUcret4;
            System.out.println("İlave Ürün:"+ this.IlaveUrunAdi4 + " İlave Ürün Ücret:"+this.IlaveUrunUcret4);
        } 
      return toplamUcret;
    }
}
