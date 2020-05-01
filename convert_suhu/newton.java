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
public class newton {
    double kel,ton,cel,ran,de,newt,rea,rom,fah;
    
    void kel(){
            kel=ton*100/33+273.15;
        System.out.println("newton to kelvin = " + kel);
        
    }
    void cel(){
        cel=ton*100/33;
        System.out.println("newton to celcius = " + cel);
    }
    void fah(){
        fah=ton*60/11+32;
        System.out.println("newton to fahreinheit = " + fah);
    }
    void ran(){
        ran=ton*60/11+491.67;
        System.out.println("newton to rankine = " + ran);
    }
    void de(){
        de= (33-ton)*50/11;
        System.out.println("newton to delisle =" +de);
    }
    void rea(){
        rea=ton*80/33;
        System.out.println("newton to reamur =" + rea);
        
    }
    void rom(){
        rom=ton*35/22+7.5;
        System.out.println("newton to romer =" + rom);
    }
}
