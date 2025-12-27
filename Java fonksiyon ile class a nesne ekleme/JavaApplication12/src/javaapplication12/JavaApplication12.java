
package javaapplication12;


public class JavaApplication12 {

    public static void main(String[] args) {
       Araba opel=new Araba();/*Atadığımız bir değişkeni sınıfda kullanilmbek için*/
       Araba bmw=new Araba();
       Araba ford=new Araba();
       Araba mercedes=new Araba();
       Araba volkswagen=new Araba();
       
         opel.ArabaEkle("Opel","Astra" , "Beyaz", 400000);/*Değişkene sınıfın içindeki değerleri  yazmak için*/   
         bmw.ArabaEkle("Bmw", "520d","Siyah", 900000);
         ford.ArabaEkle("Ford", "Focus","Kirmizi",450000);
         mercedes.ArabaEkle("Mercedes","C180","Lacivert",1200000);
         volkswagen.ArabaEkle("Volkswagen","Golf","Beyaz", 800000);
            opel.RenkKarsilastir(bmw);/*Metodu çağırmak içim*/
            mercedes.FiyatKarsilastir(ford);
            bmw.AracOzellikleri(volkswagen);
            ford.display();
            bmw.display();
            
          
                 
            
                
                             
    }
}
