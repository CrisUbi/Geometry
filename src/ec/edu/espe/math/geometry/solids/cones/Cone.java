/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cones;

import ec.edu.espe.math.geometry.circumferences.Circumference;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Cone extends Circumference implements ConeSolid{
    private Float sideOne;
    private Float height;

    public Cone(Float sideOne, Float height, Float radio) {
        super(radio);
        this.sideOne = sideOne;
        this.height = height;
    }

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.sideOne);
        hash = 59 * hash + Objects.hashCode(this.height);
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
        final Cone other = (Cone) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }
    
    @Override
    public Float area() {
        return null;
    }

    @Override
    public Float perimetre() {
        return null;
    }

    @Override
    public Float volumen() {
        return null;
    }
    
}
