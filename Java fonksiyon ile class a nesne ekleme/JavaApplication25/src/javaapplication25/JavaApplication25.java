
package javaapplication25;


public class JavaApplication25 {

    
    public static void main(String[] args) {
    Calisan calisan1=new Calisan();
    calisan1.Calisan_ekle("Ahmet","Demir", 10000);
    Yonetici yonetici1=new Yonetici();
    yonetici1.Yonetici_ekle("Sami","Bas",1000000,"Amir");
    calisan1.display();
    yonetici1.display_yonetici();
    }
    
}
