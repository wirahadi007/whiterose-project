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
public class reamur {
        double kel,cel,ran,de,newt,rea,rom,fah,ton;
    
    void kel(){
            kel=rea/0.8+273.15;
        System.out.println("reamur to kelvin = " + kel);
        
    }
    void cel(){
        cel=rea/0.8;
        System.out.println("reamur to celcius = " + cel);
    }
    void fah(){
        fah=rea*2.25+32;
        System.out.println("reamur to fahreinheit = " + fah);
    }
    void ran(){
        ran=rea*2.25+491.67;
        System.out.println("reamur to rankine= " + ran);
    }
    void de(){
        de= (80-rea)*1.875;
        System.out.println("reamur to delisle =" +newt);
    }
    void ton(){
        rea=rea*33/80;
        System.out.println("reamur to newton =" + rea);
        
    }
    void rom(){
        rom=rea*21/32+7.5;
        System.out.println("reamur to romer =" + rom);
    }
}
