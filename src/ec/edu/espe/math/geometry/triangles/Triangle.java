/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.triangles;

import java.util.Objects;
import ece.edu.espe.math.geometry.Shape;

/**
 *
 * @author User
 */
public abstract class Triangle extends Shape{
    protected Float sideOne;
    protected Float sideTwo;
    protected Float sideThree;

    public Float getSideOne() {
        return sideOne;
    }

    public Float getSideTwo() {
        return sideTwo;
    }

    public Float getSideThree() {
        return sideThree;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(Float sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(Float sideThree) {
        this.sideThree = sideThree;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.sideOne);
        hash = 41 * hash + Objects.hashCode(this.sideTwo);
        hash = 41 * hash + Objects.hashCode(this.sideThree);
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
        final Triangle other = (Triangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        if (!Objects.equals(this.sideTwo, other.sideTwo)) {
            return false;
        }
        if (!Objects.equals(this.sideThree, other.sideThree)) {
            return false;
        }
        return true;
    }
    
   
}
