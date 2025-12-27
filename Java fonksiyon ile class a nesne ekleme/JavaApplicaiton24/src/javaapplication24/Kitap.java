
package javaapplication24;


public class Kitap {
public String Kitap_adi;
public String Kitap_yazari;
public int Kitap_fiyati;

void Kitap_ekle(String a1, String a2, int a3){
    Kitap_adi=a1;
    Kitap_yazari=a2;
    Kitap_fiyati=a3;
}
void display(){
        System.out.println("Kitap bilgileri");
        System.out.println("Kitabin adi:"+Kitap_adi);
        System.out.println("Kitabin yazari:"+Kitap_yazari);
        System.out.println("Kitabin fiyati:"+Kitap_fiyati);
    }

}
