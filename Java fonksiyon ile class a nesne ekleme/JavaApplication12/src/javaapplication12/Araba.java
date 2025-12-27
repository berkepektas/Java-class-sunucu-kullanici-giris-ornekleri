
package javaapplication12;

public class Araba  {
    public String marka;
    public String model;
    public String renk;
    public int fiyat;
    public int numara;
    
    void ArabaEkle(String a1,String a2,String a3,int a4){/*Araba ekleme metodu*/
        marka=a1;
        model=a2;
        renk=a3;
        fiyat=a4;
        
    }
    void RenkKarsilastir(Araba Araba2) {/*Renk karşılaştırma metodu*/
       System.out.println("Sectiginiz araclarin renkleri karsilasitiriliyor...");
       if (renk.equals(Araba2.renk)) {/*Renkleri aynı ise çalışıyor markalarını ve renklerini yazdırıyor*/
          System.out.println("Renkleri ayni 2 arac sectiniz"+"  Ikisinin rengide:"+renk);
           System.out.println("1.arac:"+marka);
            System.out.println("2.arac"+Araba2.marka);
       } else {/*Renkleri farklı ise çalışıyor markaları ile renklerini yazdırıyor*/
            System.out.println("Renkleri farkli 2 arac sectiniz");
            System.out.println(marka+"'in Rengi:"+renk);
            System.out.println(Araba2.marka+"'in Rengi:"+Araba2.renk);
       }
       
    }
    void FiyatKarsilastir(Araba Araba2){/*Fiyat karşılaştırma metodu*/
        System.out.println("Sectiginiz araclarin fiyatlari karsilasitiriliyor...");
        if(fiyat==(Araba2.fiyat)){/*Fiyatları  aynı ise çalışıyor ve fiyatlarını yazdırıyor*/
            System.out.println("Fiyatları ayni 2 arac sectiniz"+"   Ikisinin fiyatida:"+fiyat);
        }
        else{/*Fiyatları farklı  ise çalışıyor ve markla ile beraber fiyatlarını yazıyor*/
            System.out.println("Fiyatlari farkli iki arac sectiniz");
            System.out.println(marka+"'in Fiyati:"+fiyat);
            System.out.println(Araba2.marka+"'in Fiyati:"+Araba2.fiyat);
            if(fiyat>(Araba2.fiyat)){/*İlk yazılan aracın fiyatı büyük ise çalışıyor*/
                int fark=fiyat-Araba2.fiyat;
                System.out.println(marka+"'in fiyati: "+fark+" daha fazla");
            }
            else{/*İkinci aracın fiyatı büyük ise çalışıyor*/
                int fark=Araba2.fiyat-fiyat;
                System.out.println(Araba2.marka+"'in fiyati "+fark+" daha fazla");
            }
        }
    }
    void AracOzellikleri(Araba Araba2){/*İki aracında tüm özelliklerini yazan metod*/
        System.out.println("Sectiginiz araclarin ozellikleri karsilasitiriliyor...");
         System.out.println("Ilk secilen aracin ozellikleri:"); 
         System.out.println("Markasi:"+marka);
         System.out.println("Modeli:"+model);
         System.out.println("Rengi:"+renk);
         System.out.println("Fiyati"+fiyat);
          System.out.println("Ikinci secilen aracin ozellikleri:");
          System.out.println("Markasi:"+Araba2.marka);
          System.out.println("Modeli:"+Araba2.model);
          System.out.println("Rengi:"+Araba2.renk);
          System.out.println("Fiyati"+Araba2.fiyat);
    }
    void display(){/*Seçilen bir aracın özelliklerini görüntüleyen metod*/
        System.out.println("Arac ozellikleri:");
        System.out.println(marka);
        System.out.println(model);
        System.out.println(renk);
        System.out.println(fiyat);
            
    }
        
        
    

           
}
