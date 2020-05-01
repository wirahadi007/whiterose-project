/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert_suhu;

/**
 *
 * @author whiterose
 */
public class delisle {
    double kel,del,cel,ran,de,newt,rea,rom,fah;
    
    void kel(){
            kel=373.15-del*2/3;
        System.out.println("delisle to kelvin = " + kel);
        
    }
    void cel(){
        cel=100-del*2/3;
        System.out.println("delisle to celcius = " + cel);
    }
    void fah(){
        fah=212-del*1/2;
        System.out.println("delisle to fahreinheit = " + fah);
    }
    void ran(){
        ran=(671.67-del)*1/2;
        System.out.println("delisle to rankine = " + ran);
    }
    void newt(){
        newt= 33-del*0.22;
        System.out.println("dleisle to newton =" +newt);
    }
    void rea(){
        rea=80-del*8/15;
        System.out.println("delisle to reamur =" + rea);
        
    }
    void rom(){
        rom=60-del*0.35;
        System.out.println("delisle to romer =" + rom);
    }
}
