/* Burger Kralı */
/* SaglikliBurgerClass */
package hamburgercafe;

public class SaglikliBurger extends Hamburger {
   private String IlaveSaglikliUrunAdi1;
   private double IlaveSaglikliUrunUcret1;
  
   private String IlaveSaglikliUrunAdi2;
   private double IlaveSaglikliUrunUcret2;
  
   /* Kurucu Method */
 public SaglikliBurger(String etCesidi,double ucret){
     super("Sağlıklı Burger","Kepekli Ekmek",etCesidi,ucret);
 }
    public void EkleIlaveSaglikliUrun1(String ad,double ucret){
        this.IlaveSaglikliUrunAdi1 = ad;
        this.IlaveSaglikliUrunUcret1 = ucret;
    }
    
     public void EkleIlaveSaglikliUrun2(String ad,double ucret){
        this.IlaveSaglikliUrunAdi2 = ad;
        this.IlaveSaglikliUrunUcret2 = ucret;
    }
     
     public double hamburgerBilgileri(){
         double toplamUcret = super.hamburgerBilgileri();
         
         if (this.IlaveSaglikliUrunAdi1 != null) {
             toplamUcret += IlaveSaglikliUrunUcret1;
             System.out.println("İlave Sağlıklı Ürün:"+ this.IlaveSaglikliUrunAdi1 + "İlave Sağlıklı Ürün Ücret:"+ this.IlaveSaglikliUrunUcret1);
         }
         
         if (this.IlaveSaglikliUrunAdi2 != null) {
             toplamUcret += IlaveSaglikliUrunUcret2;
             System.out.println("İlave Sağlıklı Ürün:"+ this.IlaveSaglikliUrunAdi2 + "İlave Sağlıklı Ürün Ücret:"+ this.IlaveSaglikliUrunUcret2);
         }
         return toplamUcret;
     }
    
}
