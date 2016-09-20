/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.triangles;

import java.util.Objects;

/**
 *
 * @author User
 */
public class RightAngleTriangle extends Triangle {
     Float base;
     Float height;

    public RightAngleTriangle(Float base, Float height) {
        this.base = base;
        this.height = height;
    }
    
    public Float getBase() {
        return base;
    }

    public Float getHeight() {
        return height;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.base);
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
        final RightAngleTriangle other = (RightAngleTriangle) obj;
        if (!Objects.equals(this.base, other.base)) {
            return false;
        }
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        return true;
    }
    
    @Override
    public Float area() {
        return (this.base*this.height)/2;
    }

    @Override
    public Float perimetre() {
        return (float)(Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2))+this.base+this.height);
    }
    
}
