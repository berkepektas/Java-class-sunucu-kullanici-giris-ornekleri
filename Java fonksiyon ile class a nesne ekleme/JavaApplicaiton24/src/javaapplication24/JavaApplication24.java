
package javaapplication24;


public class JavaApplication24 {

   
    public static void main(String[] args) {
        Kitap kitap1=new Kitap();
        Kitap kitap2=new Kitap();
        Kitap kitap3=new Kitap();
        kitap1.Kitap_ekle("Atesten Gomlek", "Halide Edip Adivar",300);
        kitap2.Kitap_ekle("Nutuk", "Mustafa Kemal ATATURK",1000);
        kitap3.Kitap_ekle("Beyoglunun En Guzel Abisi", "Ahmet Umit",200);
        kitap1.display();
        kitap2.display();
        kitap3.display();
    }
    
}
