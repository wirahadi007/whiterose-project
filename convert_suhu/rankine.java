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
public class rankine {
     double kel,ra,cel,ran,de,newt,rea,rom,fah;
    
    void kel(){
        kel=ra/1.8;
        System.out.println("rankine to kelvin = " + kel);
        
    }
    void cel(){
        cel=ra/1.8+273.15;
        System.out.println("rankine to celcius = " + cel);
    }
    void fah(){
        fah=ra-459.67;
        System.out.println("rankine to fahrenheit = " + fah);
    }
    void de(){
        de=(671.67-ra)*5/6;
        System.out.println("rankine to delisle = " + de);
    }
    void newt(){
        newt= (ra-491.67)*11/60;;
        System.out.println("rankine to newton =" +newt);
    }
    void rea(){
        rea=(ra/1.8/273.15)*0.8;
        System.out.println("rankine to reamur =" + rea);
        
    }
    void rom(){
        rom=(ra-491.67)*7/24+7.5;
        System.out.println("rankine to romer =" + rom);
    }
}
