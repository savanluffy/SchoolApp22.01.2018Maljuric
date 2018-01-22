/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgAppl;

import java.util.logging.Level;
import java.util.logging.Logger;
import pkgData.Car;
import pkgData.Owner;

/**
 *
 * @author savan_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Owner o1 = new Owner("0001","Owner1");
            Owner o2 = new Owner("0002","Owner2");
            
            Car c1 = new Car(1,"Model S", "Tesla",o1);
            Car c2 = new Car(2,"Model 3", "Tesla",o2);
            Car c3 = new Car(3,"TT", "Audi",o2);
            
            System.out.println(c3.toString());
        } catch (Exception ex) {
            System.out.println("error:"+ex.getMessage());
        
        }
        
        
    }
    
    public static void ValiBlob(){
        int x = 10;
    }
    
}
