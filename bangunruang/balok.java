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
public class balok {
    
    int panjang,lebar,tinggi,luas,volume,keliling;
    
    
    void luas(){
    
        luas=2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
        System.out.println("Luas= " + luas);
    }
    
    void volume(){
    
        volume=panjang*lebar*tinggi;
        System.out.println("volume= " + volume);
    }
    
    void keliling(){
    
        keliling = 4*(panjang+lebar+tinggi);
        System.out.println("keliling= " + keliling);
    
    }
    
}
