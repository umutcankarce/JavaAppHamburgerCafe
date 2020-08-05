package hamburgercafe;

public class BabaBurger extends Hamburger {
    
    /* Kurucu Method */
    public BabaBurger(){
        super("Baba Burger","Beyaz Ekmek","Kırmızı Et",14.90);
        super.EkleIlaveUrun1("Patates Kızartması", 5.0);
         super.EkleIlaveUrun1("Kola Zero", 3.0);
    }
    
    public void ekleIlaveUrun1(String ad,double ucret){
        System.out.println("İlave Ürün Ekleyemezsiniz!");
    }
     public void ekleIlaveUrun2(String ad,double ucret){
         System.out.println("İlave Ürün Ekleyemezsiniz!");
    }
      public void ekleIlaveUrun3(String ad,double ucret){
        System.out.println("İlave Ürün Ekleyemezsiniz!");
    }
    public void ekleIlaveUrun4(String ad,double ucret){
     System.out.println("İlave Ürün Ekleyemezsiniz!");
 }
}
