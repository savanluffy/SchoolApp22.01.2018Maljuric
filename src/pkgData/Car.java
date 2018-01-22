/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

import java.util.ArrayList;

/**
 *
 * @author savan_000
 */
public class Car {
    private int FGNr;
    private String name;
    private String type;
    private Owner owner;

    private static ArrayList<Integer> allCarIds = new ArrayList<>();
    
    public Car(int FGNr, String name, String type, Owner o) throws Exception {
        setFGNr(FGNr);
        setName(name);
        setType(type);
        setOwner(o);
    }

    

    public int getFGNr() {
        return FGNr;
    }

    
    public void setFGNr(int FGNr) throws Exception{
        this.FGNr = FGNr;
        if(allCarIds.contains(this.FGNr))
            throw new Exception("FGNr already excists!! ");
         allCarIds.add(this.FGNr);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) throws Exception{ 
        if(owner == null)
            throw new Exception("there has to be a owner of a car");
        owner.addCar(this);
        this.owner = owner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.FGNr;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.FGNr != other.FGNr) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Car{" + "FGNr=" + FGNr + ", name=" + name + ", type=" + type + ", owner=" + owner.getName() + '}';
    }   
}
