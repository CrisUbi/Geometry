/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cylinders;

import ec.edu.espe.math.geometry.circumferences.Circumference;
import ec.edu.espe.math.geometry.solids.circunferences.Sphere;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Cylinder extends Circumference implements CylinderSolid{
    private Float height;

    public Cylinder(Float height, Float radio) {
        super(radio);
        this.height = height;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.height);
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
        final Cylinder other = (Cylinder) obj;
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }
   
    @Override
    public Float area() {
        return (float)Math.PI*2*this.radio*this.height;
    }

    @Override
    public Float perimetre() {
        return (float)Math.PI*2*this.radio*(this.radio+this.height);
    }

    @Override
    public Float volumen() {
        return (float)(Math.PI*Math.pow(this.radio, 2)*this.height);
    }
    

    
}
