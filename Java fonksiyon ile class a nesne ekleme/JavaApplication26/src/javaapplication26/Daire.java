
package javaapplication26;


public class Daire {
     public int cap;
    public double Alan;
    public double pi;
    
    void Daire_Alan(int a1){
         cap=a1;
         pi=3.14;
         Alan=a1*a1*pi;
    }
    void Daire_display(){
        System.out.println(Alan);
    }
}
