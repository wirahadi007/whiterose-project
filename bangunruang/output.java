/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

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
        
        int choise;
        Scanner t = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("SELAMAT DATANG DI PENGHITUNG BANGUN RUANG");
        System.out.println("=========================================");
        System.out.println("");
        
        System.out.println("SILAHKAN DIPILIH RUMUS YANG AKAN DIGUNAKAN");
        System.out.println("");
        
        System.out.println("1.KUBUS");
        System.out.println("2.BALOK");
        System.out.println("3.LIMAS_SEGITIGA");
        System.out.println("4.LIMAS_SEGIEMPAT");
        System.out.println("5.PRISMA SEGITIGA");
        System.out.println("6.PRISMA_SEGIEMPAT");
        System.out.println("7.KERUCUT");
        System.out.println("8.TABUNG");
        System.out.println("9.BOLA");
        
        System.out.println("");
        System.out.println("");
        System.out.println("MASUKKAN PILIHAN ANDA");
        
        choise = t.nextInt();
        
        kubus rubik = new kubus();
        balok kv = new balok();
        limas l = new limas();
        limas ls = new limas();
        prisma pr = new prisma();
        kerucut ucut = new kerucut();
        tabung gas =new tabung();
        bola bal = new bola();
        
        if(choise==1){
        
            System.out.println("MASUKKAN SISI= ");
            rubik.sisi=t.nextInt();
            System.out.println("MASUKKAN DIAGONAL SISI= ");
            rubik.a=t.nextInt();
            System.out.println("MASUKKAN DIAGONAL RUANG= ");
            rubik.b=t.nextInt();
            
            rubik.luas();
            rubik.volume();
            rubik.ds();
            rubik.dr();
        }
        
        else if(choise==2){
        
            System.out.println("MASUKKAN PANJANG=");
            kv.panjang=t.nextInt();
            System.out.println("MASUKKAN LEBAR=");
            kv.lebar=t.nextInt();
            System.out.println("MASUKKAN TINGGI=");
            kv.tinggi=t.nextInt();
            
            kv.luas();
            kv.keliling();
            kv.volume();
        }
        
        
        else if(choise==3){
        
            System.out.println("masukkan Alas= ");
            l.alas=t.nextInt();
            System.out.println("masukkan Tinggi=");
            l.tinggi=t.nextInt();
            System.out.println("masukkan sisi tegak=");
            l.s_tegak=t.nextInt();
            
            l.luas();
            l.volume();
            
        }
        
          else if(choise==4){
        
            System.out.println("masukkan Luas Alas= ");
            l.a=t.nextInt();
            System.out.println("masukkan jumlah LUAS SISI=");
            l.ls=t.nextInt();
            System.out.println("MASUKKAN PANJANG=");
            l.p=t.nextInt();
            System.out.println("MASUKKAN TINGGI=");
            l.t=t.nextInt();
            System.out.println("MASUKKAN LEBAR=");
            l.l=t.nextInt();
            
            
            l.limas_segiempat();
            
        }
           else if(choise==5){
        
            System.out.println("masukkan Luas Alas= ");
            pr.alas=t.nextInt();
            System.out.println("masukkan jumlah KELILING ALAS=");
            pr.kllalas=t.nextInt();
            System.out.println("MASUKKAN TINGGI=");
            pr.tinggi=t.nextInt();
            
            
            pr.luas();
            pr.volume();
            
        }
           else if(choise==6){
        
            System.out.println("masukkan Luas Alas= ");
            pr.alas=t.nextInt();
            System.out.println("masukkan SELUBUNG=");
            pr.selubung=t.nextInt();
            System.out.println("MASUKKAN LUAS ALAS=");
            pr.la=t.nextInt();
            System.out.println("masukkan luas alas");
            pr.la=t.nextInt();
            System.out.println("masukkan panjang alas");
            pr.p=t.nextInt();
            System.out.println("masukkan lebar alas");
            pr.l=t.nextInt();
            System.out.println("masukkan tinggi alas");
            pr.t=t.nextInt();
            System.out.println("masukkan Tinggi Prisma");
            pr.tinggi=t.nextInt();
            
            
            pr.prismasegiempat();
            
        }
           else if(choise==7){
        
            System.out.println("masukkan Luas Alas= ");
            ucut.la=t.nextInt();
            System.out.println("masukkan Tinggi=");
            ucut.t=t.nextInt();
            System.out.println("masukkan Jari-Jari=");
            ucut.r=t.nextInt();
            
            ucut.luas();
            ucut.volume();
            
        }
           
           else if(choise==8){
        
            System.out.println("masukkan Jari-Jari= ");
            gas.r=t.nextInt();
            System.out.println("masukkan Tinggi=");
            gas.t=t.nextInt();
          
            
            gas.luas();
            gas.volume();
            
        }
            else if(choise==9){
        
            System.out.println("masukkan Jari-Jari= ");
            bal.r=t.nextInt();
            
          
            
            bal.luas();
            bal.volume();
            
        }
        else{
        
            System.out.println("ERROR");
        }
        
        
    }
    
}
