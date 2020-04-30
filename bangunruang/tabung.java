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
public class tabung {
    double phi=3.14,r,t,luas,volume,ls,kll;
    
    
    void luas(){
        
         luas=2*phi*r*r;
         System.out.println("luas =" + luas);
         
    
    
    
    }
    
    void luasselimut(){
        ls=2*phi*r*t;
        System.out.println("luas Selimut= " + ls);
    
    }
    
    void kelilingalas(){
    
        kll=2*phi*r;
    
    }
    
    void volume(){
    
        volume=phi*r*r*t;
        System.out.println("volume" + volume);
    }
    
}
