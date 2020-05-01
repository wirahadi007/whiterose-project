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
public class celcius {
    double s,hacel,hafah,haran,hade,hanew,harea,harom;
    
    void hacel(){
        hacel= s + 273.15;
        System.out.println("celius to kelvin= " +hacel);
    }
    void hafah(){
        hafah = s *1.8+32;
        System.out.println("cerlcius to fahrenheit= " +hafah);
    }
    void haran(){
        haran= 1.8*(s+491.67);
        System.out.println("celcius to rankine= " +haran);
    }
    void hade(){
        hade=(100-s)*1.5;
        System.out.println("celcius to delisle = " +hade);
        
    }
    void hanew(){
        hanew=s*33/100;
        System.out.println("celcius to newton= " +hanew);
    }
    void harea(){
        harea=s*0.8;
        System.out.println("celcius to reamur= " +harea);
    }
    void harom(){
        harom=s*21/40+7.5;
        System.out.println("celcius to romer= " + harom);
    }
}