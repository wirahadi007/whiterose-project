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
public class limas {
    
    int alas,tinggi,volume,luas,s_tegak,permukaanluas,lebar,vol,lu,s,a,t,p,l,ls;
    
   void luas(){
   
   luas= alas*tinggi;
   
   System.out.println("luas= " + luas);
   }
   
   void permukaanlimas(){
   
   permukaanluas = alas*s_tegak;
   
   System.out.println("permukaan luas= " + permukaanluas);
   }
   
   void volume(){
       
   
   volume =(alas*tinggi)/3; 
   System.out.println("volume= " + volume);
   }
   
   void limas_segiempat(){
   
   lu= (a+4*ls)/2;
   System.out.println("luas=" +lu);
   
   s=(a*t)*4/2;
   System.out.println("Luas Permukaan=" + s);
   
   vol=(p*l*t)/3;
   System.out.println("volume=" + vol);
   
   
   
   }
   
    
}

