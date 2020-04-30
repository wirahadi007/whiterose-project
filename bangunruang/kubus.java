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
public class kubus {
    
    int luas,volume,sisi,ds,dr,a,b;
    double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
    double d = Math.sqrt( Math.pow(a,3) + Math.pow(b,3) );
    
    void luas(){
    
        luas=6*sisi*sisi;
        System.out.println("luas= " + luas);
    }
    
    void volume(){
    
        volume= sisi*sisi*sisi;
        System.out.println("volume= " + volume);
    }
    
    void ds(){
    
      double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) ); 
      System.out.println("diagonal sisi= " + c);
               
    }
    
    void dr(){
    
       double d = Math.sqrt( Math.pow(a,3) + Math.pow(b,3) );
       System.out.println("diagonal ruang= "+ d);
    }
}
