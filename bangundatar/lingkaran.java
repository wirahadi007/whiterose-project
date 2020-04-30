/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author whiterose
 */
public class lingkaran {
    
    double phi=3.14, r, luas,keliling;
   
    
    void luas(){
       
    luas = phi*r*r;
    System.out.println("luas= " + luas);
    }
    
    void keliling(){
    
    keliling = 2*phi*r;
    System.out.println("keliling= " + keliling);
    }
    
    
}
