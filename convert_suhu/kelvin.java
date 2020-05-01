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
public class kelvin {
    double cel,k,fah,ran,de,newt,rea,rom;
    
    void cel(){
        cel=k-273.15;
        System.out.println("kelvin to celcius= "+ cel);
    }
    void fah(){
        fah=k*1.8-459.67;
        System.out.println("kelvin to fahrenheit = " + fah);
    }
    void ran(){
        ran=k*1.8;
        System.out.println("kelvin to rankine= " + ran);
    }
    void de(){
        de=(373.15 - k)*1.5;
        System.out.println("kelvin to delisle= " + de);
        
    }
    void newt(){
        newt=(k-273.15)*33/100;
        System.out.println("kelvin to newton= " + newt);
    }
    
    void rea(){
        rea=(k-273.15)*0.8;
        System.out.println("kelvin to reamur = " + rea); 
    }
    void rom(){
        rom=(k-273.15)*21/40+7.5;
        System.out.println("kelvin to romer =" +rom);
    }
    
    
}
