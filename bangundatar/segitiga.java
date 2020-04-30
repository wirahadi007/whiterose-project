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
public class segitiga {
    
    int luas,keliling,alas,tinggi,miring;
    
    void luas(){
    
    luas=(alas*tinggi)/2;
    System.out.println("Luas= " + luas);
    }
    
    void keliling(){
    
    keliling=alas+tinggi+miring;
    System.out.println("keliling= " +keliling);
    }
    
}
