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
public class romer {
            double kel,cel,ran,de,newt,rea,rom,fah,ton;
    
    void kel(){
            kel=(rom-7.5)*40/21 + 273.15;
        System.out.println("romer to kelvin = " + kel);
        
    }
    void cel(){
        cel=(rom-7.5)*40/21;
        System.out.println("romer to celcius = " + cel);
    }
    void fah(){
        fah=(rom-7.5)*24/7 + 32;
        System.out.println("romer to fahreinheit = " + fah);
    }
    void ran(){
        ran=(rom-7.5)*24/7 + 491.67;
        System.out.println("romer to rankine = " + ran);
    }
    void de(){
        de= (rom-7.5)*20/7;
        System.out.println("romer to delisle =" +newt);
    }
    void ton(){
        rea=(rom-7.5)*22/35;
        System.out.println("romer to newton =" + rea);
        
    }
    void rea(){
        rea=(rom-7.5)*32/21;
        System.out.println("romer to reamur =" + rom);
    }
}
