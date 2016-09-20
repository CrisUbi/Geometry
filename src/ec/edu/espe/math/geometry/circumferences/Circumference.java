/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.circumferences;

import java.util.Objects;
import ece.edu.espe.math.geometry.Shape;

/**
 *
 * @author User
 */
public abstract class Circumference extends Shape{
    protected Float radio;

    public Circumference(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.radio);
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
        final Circumference other = (Circumference) obj;
        if (!Objects.equals(this.radio, other.radio)) {
            return false;
        }
        return true;
    }
    
}
