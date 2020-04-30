/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Scanner;
/**
 *
 * @author whiterose
 */
public class appmtrpntr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int pilihan;
       
       Scanner k = new Scanner(System.in);
       
       System.out.println("================================");
        System.out.println("|SELAMAT DATANG|");
         System.out.println("================================");
         
          System.out.println("MASUKKAN KECEPATAN SEPEDA ANDA");
          int s= k.nextInt();
          System.out.println("MASUKKAN TANKI ANDA=?");
          int t =k.nextInt();
           System.out.println("");
           
           
           if(t<=1){
           
           System.out.println("sing mejalan");
           }else{
           System.out.println("jeg ngebut");
           }
    }
    
}
