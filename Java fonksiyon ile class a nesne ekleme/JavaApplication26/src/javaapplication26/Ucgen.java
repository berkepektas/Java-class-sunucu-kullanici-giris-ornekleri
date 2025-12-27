
package javaapplication26;


public class Ucgen {
     public int Kenar;
     public int yukseklik;
    public double Alan;
    void Ucgen_Alan(int a1,int a3){
         Kenar=a1;
         yukseklik=a3;
         Alan=a1*a3/2;
    }
    void Ucgen_display(){
        System.out.println(Alan);
    }
}
