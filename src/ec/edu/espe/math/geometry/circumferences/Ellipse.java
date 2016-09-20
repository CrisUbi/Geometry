/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.circumferences;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Ellipse extends Circumference{
    private Float radioTwo;

    public Ellipse(Float radioTwo, Float radio) {
        super(radio);
        this.radioTwo = radioTwo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.radioTwo);
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
        final Ellipse other = (Ellipse) obj;
        if (!Objects.equals(this.radioTwo, other.radioTwo)) {
            return false;
        }
        return true;
    }

    public Float getRadioTwo() {
        return radioTwo;
    }

    public void setRadioTwo(Float radioTwo) {
        this.radioTwo = radioTwo;
    }

    @Override
    public Float area() {
        return (float)(Math.PI*this.radio*this.radioTwo);
    }

    @Override
    public Float perimetre() {
        return (float)(2*Math.PI*Math.sqrt((Math.pow(this.radio, 2)+Math.pow(this.radioTwo, 2)))/2);
    }
    
}
