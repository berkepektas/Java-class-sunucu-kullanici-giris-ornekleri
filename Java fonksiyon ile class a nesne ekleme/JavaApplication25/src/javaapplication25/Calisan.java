
package javaapplication25;


public class Calisan {
    public String isim;
    public String soyisim;
    public int maas;
    
    void Calisan_ekle(String a1, String a2, int a3){
    isim=a1;
    soyisim=a2;
    maas=a3;
}
    void display(){
    System.out.println("Calisan Bilgileri:");
    System.out.println("isim:"+isim);
    System.out.println("Soyisim"+soyisim);
    System.out.println("Maas:"+maas);
}
}
