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
public class persegi_panjang {
    
    int panjang,lebar,keliling,luas;
    
            
    void luas(){
    
    luas = panjang*lebar;
    
    System.out.println("Luas= " + luas);
    }
    
    void keliling(){
    
    keliling = 2*(panjang+lebar);
    System.out.println("keliling= " + keliling);
    }
    
}
