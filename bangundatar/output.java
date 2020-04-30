/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

import java.util.Scanner;



/**
 *
 * @author whiterose
 */
public class output {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int pilihan;
        
       Scanner keyboard = new Scanner(System.in);
        
       System.out.println("---------------------------------------");
       System.out.println("SELAMAT DATANG DI APLIKASI BANGUN DATAR");
       System.out.println("---------------------------------------");
       System.out.println("");
       
       System.out.println("silahkan pilih");
       System.out.println("");
       
       System.out.println("1.persegi ");
       System.out.println("2.persegi panjang");
       System.out.println("3.segitiga");
       System.out.println("4.Jajar genjang");
       System.out.println("5.Layang-layang");
       System.out.println("6.Belah ketupat");
       System.out.println("7.Lingkaran");
       System.out.println("8.Trapesium");
       System.out.println("");
       System.out.println("");
       System.out.println("Masukkan pilihan anda=> ");
       
       pilihan = keyboard.nextInt();
      
       
       
       //constor objek
       
       persegi kotak = new persegi(); 
       persegi_panjang panjang = new persegi_panjang(); 
       segitiga tiga = new segitiga();
       jajarangenjang jargen = new jajarangenjang();
       layang_layang lala = new layang_layang();
       belah_ketupat betu = new belah_ketupat();
       lingkaran bulat= new lingkaran();
       trapesium siu=  new trapesium();
       

       //kondisi
       if (pilihan == 1){
           
            System.out.println("MASUKKAN SISI= ");
            kotak.sisi=keyboard.nextInt();

            kotak.luas();
            kotak.keliling();

       }
       else if(pilihan==2){
       
            System.out.println("MASUKKAN PANJANG");
            panjang.panjang=keyboard.nextInt();
            System.out.println("MASUKKAN LEBAR");
            panjang.lebar=keyboard.nextInt();

            panjang.keliling();
            panjang.luas();
            }
            else if(pilihan==3){
            System.out.println("MASUKKAN ALAS");
            tiga.alas=keyboard.nextInt();
            System.out.println("MASUKKAN TINGGI");
            tiga.tinggi=keyboard.nextInt();
            System.out.println("MASUKKAN SISI MIRING");
            tiga.miring=keyboard.nextInt();

            tiga.luas();
            tiga.keliling();
       }
       else if(pilihan==4){
       
           System.out.println("MASUKKAN ALAS");
           jargen.alas=keyboard.nextInt();
           System.out.println("MASUKKAN TINGGI");
           jargen.tinggi=keyboard.nextInt();
           System.out.println("MASUKKAN MIRING");
           jargen.miring=keyboard.nextInt();
           
           jargen.luas();
           jargen.keliling();
           
       }
       else if(pilihan==5){
       
           System.out.println("MASUKKAN SISI A");
           lala.sisi_a=keyboard.nextInt();
           System.out.println("MASUKKAN SISI B");
           lala.sisi_b=keyboard.nextInt();
           System.out.println("MASUKKAN DIAGONAL 1");
           lala.d1=keyboard.nextInt();
           System.out.println("MASUKKAN DIAGONAL 2");
           lala.d2=keyboard.nextInt();
           
           lala.luas();
           lala.keliling();
           
       }
       else if(pilihan==6){
       
           System.out.println("MASUKKAN SISI ");
           betu.sisi=keyboard.nextInt();
           System.out.println("MASUKKAN DIAGONAL 1");
           betu.d1=keyboard.nextInt();
           System.out.println("MASUKKAN DIAGONAL 2");
           betu.d2=keyboard.nextInt();
           
           betu.luas();
           betu.keliling();
           
       }
       
       else if (pilihan == 7){
           
            System.out.println("MASUKKAN JARI-JARI ");
            bulat.r=keyboard.nextInt();

            bulat.luas();
            bulat.keliling();
            
       }
       
       else if (pilihan==8){
           System.out.println("MASUKKAN SISI 1");
           siu.s1=keyboard.nextInt();
           System.out.println("MASUKKAN SISI 2");
           siu.s2=keyboard.nextInt();
           System.out.println("MASUKKAN SISI 3");
           siu.s3=keyboard.nextInt();
           System.out.println("MASUKKAN SISI 4");
           siu.s4=keyboard.nextInt();
           System.out.println("MASUKKAN TINGGI");
           siu.t=keyboard.nextInt();
          
           siu.luas();
           siu.keliling();
           
       }
       
       else{
       System.out.println("error");
       }
    }
    
}
