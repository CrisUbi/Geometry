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
public class EquilateralTriangle extends Triangle{
    private Float sideOne;
    
    @Override
    public Float area() {
        return (float)(Math.sqrt(3/4)*Math.pow(this.sideOne, 2));
    }

    @Override
    public Float perimetre() {
       return 3*this.sideOne;
    }

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.sideOne);
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
        final EquilateralTriangle other = (EquilateralTriangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        return true;
    }
    
}
