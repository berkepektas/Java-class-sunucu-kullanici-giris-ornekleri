
package javaapplication22;
import java.util.Hashtable;
import java.util.Scanner;

public class JavaApplication22 {

    
    public static void main(String[] args) {
        Hashtable<String,String> kullanicilar=new Hashtable<>();
        kullanicilar.put("berke", "1234");
        kullanicilar.put("sami", "sami1234");
        kullanicilar.put("furkan", "furkan1234");
        Scanner girdi=new Scanner(System.in);
        System.out.println("Kullanici adi girin: ");
        String girilen_kullanici=girdi.nextLine();
        System.out.println("Sifre giriniz: ");
        String girilen_sifre=girdi.nextLine();
        if(kullanicilar.containsKey(girilen_kullanici)){
            String dogrusifre=kullanicilar.get(girilen_kullanici);
            if(dogrusifre.equals(girilen_sifre)){
                System.out.println("Basarili giris.");
            }    
                else{
                        System.out.println("Hatali sifre...");
                        }
            
        } else{
                System.out.println("Hatalı Kullanici adi veya sifre");
        }
        
    }
    
}
