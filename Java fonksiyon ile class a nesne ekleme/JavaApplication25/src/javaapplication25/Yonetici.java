
package javaapplication25;


public class Yonetici extends Calisan{
    public String departman;
    void Yonetici_ekle(String a1,String a2,int a3,String a4){
        departman=a4;
    }
    void display_yonetici(){
        System.out.println("Yonetici Bilgileri:");
        System.out.println("isim,"+isim);
        System.out.println("Soyisim"+soyisim);
        System.out.println("Maas"+maas);
        System.out.println("Departman"+departman);




    }
}
