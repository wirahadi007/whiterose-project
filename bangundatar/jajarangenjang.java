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
public class jajarangenjang {
    
    int keliling,luas,alas,tinggi,miring;
    
    void luas(){
    
    luas = alas*tinggi;
    System.out.println("luas= " + luas);
    }
    
    void keliling(){
    
    keliling = 2*(alas+miring);
    System.out.println("keliling= " + keliling);
    
    }
    
    
}
