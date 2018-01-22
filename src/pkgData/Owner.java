/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgData;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author savan_000
 */
public class Owner {
    private String SVNr;
    private String name;
    HashSet<Car> allCars = new HashSet<>();
    private static ArrayList<String> allOwnerSVNs = new ArrayList<>();
    
    public Owner(String SVNr, String name) throws Exception{
        setSVNr(SVNr);
        setName(name);
    }

    public void addCar(Car c) throws Exception{
        if(allCars.contains(c))
            throw new Exception("this user has already this car");
        if(c.getOwner()!=null)
            throw new Exception("this car belongs to other owner");
    
        
        allCars.add(c);
    }
    
    public String getSVNr() {
        return SVNr;
    }

    public void setSVNr(String SVNr) throws Exception{
        this.SVNr = SVNr;
         if(allOwnerSVNs.contains(this.SVNr))
            throw new Exception("SVNg already excists!! ");
         allOwnerSVNs.add(this.SVNr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Car> getAllCars() {
        return allCars;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.SVNr);
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
        final Owner other = (Owner) obj;
        if (!Objects.equals(this.SVNr, other.SVNr)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Owner{" + "SVNr=" + SVNr + ", name=" + name + ", allCars=" + allCars + '}';
    }    
}
