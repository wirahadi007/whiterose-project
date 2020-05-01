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
public class fahrenheit {
    double kel,f,cel,ran,de,newt,rea,rom;
    
    void kel(){
        kel=(f+459.67)/1.8;
        System.out.println("fahrenheit to kelvin = " + kel);
        
    }
    void cel(){
        cel=(f-32)/1.8;
        System.out.println("kelvin to celcius = " + cel);
    }
    void ran(){
        ran=f+459.67;
        System.out.println("fahrenheit to rankine = " + ran);
    }
    void de(){
        de=(212-f)*5/6;
        System.out.println("fahrenheit to delisle = " + de);
    }
    void newt(){
        newt= (f-32)*11/60;;
        System.out.println("fahrenheit to newton =" +newt);
    }
    void rea(){
        rea=(f-32)*0.44;
        System.out.println("fahrenheit to reamur =" + rea);
        
    }
    void rom(){
        rom=(f-32)*7/24+7.5;
        System.out.println("fahrenheit to romer =" + rom);
    }
    
    
}
