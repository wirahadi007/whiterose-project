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
public class bola {
    
    
    double phi=3.14,r,lp,vol;
    
    
    void luas(){
    
    lp=4*phi*r*r;
    System.out.println("luas= "+lp);
    
    }
    
    void volume(){
    
    vol=4/3*phi*r*r*r;
    System.out.println("volume =" +vol);
    }
}
