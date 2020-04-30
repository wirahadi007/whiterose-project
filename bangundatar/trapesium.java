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
public class trapesium {
    
    int t,luas,s1,s2,s3,s4,keliling;
    
    
    void luas(){
    
    luas=(s1+s2)*t/2;
    System.out.println("luas= " + luas);
    
    }
    
    void keliling(){
    
    keliling= s1+s2+s3+s4;
    System.out.println("keliling= " + keliling);
    }
    
}
