/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author whiterose
 */
public class prisma {
    
    int alas,luas,volume,tinggi,kllalas,l,v,selubung,la,t,p;
    
    void luas(){
    
    luas = (2*alas)+(kllalas*tinggi);
    System.out.println("luas= " + luas);
    }
    
    void volume(){
        
        volume=alas*tinggi;
        
        System.out.println("volume= " + volume);
        
    }
    
    void prismasegiempat(){
       l=(2*luas)+selubung;
       System.out.println("luas=" +l);

       v=la*(p*l*t)*tinggi;
       System.out.println("volume=" +v);
    
    }
    
}
