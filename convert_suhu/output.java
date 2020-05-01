/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert_suhu;

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
    
    Scanner a = new Scanner(System.in);
    
    System.out.println("====================================");
    System.out.println("Selamat Datang di Aplikasi Conversi Suhu");
    System.out.println("====================================");
    System.out.println("");
    
    
    System.out.println("Silahkan Pilih Rumus Yang Akan Anda Gunakan");
    System.out.println("");
    
    
    System.out.println("1.kelvin");
    System.out.println("2.Celcius");
    System.out.println("3.Fahrenheit");
    System.out.println("4.Rankine");
    System.out.println("5.Delisle");
    System.out.println("6.Newton");
    System.out.println("7.Reamur");
    System.out.println("8.Romer");


        pilihan = a.nextInt();
        
        kelvin kel= new kelvin();
        celcius cel = new celcius();
        fahrenheit fah = new fahrenheit();
        rankine ran = new rankine();
        delisle del = new delisle();
        newton newt = new newton();
        reamur rea = new reamur();
        romer rom = new romer();
        
        if(pilihan==1){
            System.out.println("masukkan Suhu Kelvin yanga akan di Convert!");
            kel.k=a.nextInt();
            
            kel.cel();
            kel.fah();
            kel.ran();
            kel.de();
            kel.newt();
            kel.rea();
            kel.rom();
            
        
        }
        else if(pilihan==2){
            System.out.println("Masukkan Angka Celcius yang akan anda Convert! ");
            cel.s=a.nextInt();
            
            cel.hacel();
            cel.hafah();
            cel.haran();
            cel.hade();
            cel.hanew();
            cel.harea();
            cel.harom();
            
        }
        else if(pilihan == 3){
            System.out.println("Masukkan Angka fahrenheiit yang akan di convert!");
            fah.f=a.nextInt();
            
            fah.kel();
            fah.cel();
            fah.ran();
            fah.de();
            fah.newt();
            fah.rea();
            fah.rom();
            
            
        }
        
        else if(pilihan==4){
            System.out.println("Masukkan angka rankin yang akan anda convert!");
            ran.ra=a.nextInt();
            
            ran.kel();
            ran.cel();
            ran.fah();
            ran.de();
            ran.newt();
            ran.rea();
            ran.rom();
            
        }
        
        else if(pilihan==5){
            System.out.println("Masukkan angka Delisle yang akan di Convert!");
            del.del=a.nextInt();
            
            del.kel();
            del.cel();
            del.fah();
            del.ran();
            del.newt();
            del.rea();
            del.rom();
        }
        
        else if(pilihan==6){
        
            System.out.println("Masukkan angka newton yang akan ada convert!");
            newt.ton=a.nextInt();
            
            newt.kel();
            newt.cel();
            newt.fah();
            newt.ran();
            newt.de();
            newt.rea();
            newt.rom();
        }
        
        else if(pilihan == 7){
            System.out.println("Masukkan angka Reamur yang akan di Convert!");
            rea.rea=a.nextInt();
            
            rea.kel();
            rea.cel();
            rea.fah();
            rea.ran();
            rea.de();
            rea.ton();
            rea.rom();
        }   
        
        else if(pilihan==8){
            System.out.println("Masukkan angka romer yang akan di convert!");
            rom.rom=a.nextInt();
            
            rom.kel();
            rom.cel();
            rom.fah();
            rom.ran();
            rom.de();
            rom.rea();
            rom.ton();
            
        }
    }
    
}
