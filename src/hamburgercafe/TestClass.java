package hamburgercafe;
/* TestClass */ 
public class TestClass {
    
    public static void main(String[] args){
    
        Hamburger hamb = new Hamburger("Sade","Beyaz Ekmek","Kırmızı Et",7.90);
        hamb.EkleIlaveUrun1("Patates Kızartması",5);
        hamb.EkleIlaveUrun2("Kola Zero",4);
        hamb.EkleIlaveUrun3("Mayonez Sos",1);
        hamb.EkleIlaveUrun4("Barbekü Sos",1);
        System.out.println("Toplam Tutar:"+hamb.hamburgerBilgileri() + " TL");  
       
        System.out.println("-----------");
       
        SaglikliBurger saglikburger = new SaglikliBurger("Ege Yeşil Burger",9.90);
        saglikburger.hamburgerBilgileri();
        saglikburger.EkleIlaveSaglikliUrun2("Mayonez Sos ", 2.0);
        saglikburger.EkleIlaveUrun1("Barbekü Sos",1);
        saglikburger.EkleIlaveUrun2("Kola Light",3.40);
        
        System.out.println("Toplam Tutar:"+saglikburger.hamburgerBilgileri() + " TL");  
         
        System.out.println("-----------");
        
        BabaBurger bg = new BabaBurger();
        System.out.println("Toplam Tutar:"+bg.hamburgerBilgileri());
        
        
    }
}
