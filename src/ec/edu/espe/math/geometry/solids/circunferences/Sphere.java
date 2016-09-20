/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circunferences;

import ec.edu.espe.math.geometry.circumferences.Circumference;
import ec.edu.espe.math.geometry.solids.Solid;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Sphere extends Circumference implements CircumferenceSolid{
    public Sphere( Float radio) {
        super(radio);
    }
    @Override
    public Float area() {
        return (float)(Math.PI*4*Math.pow(this.radio,2));
    }

    @Override
    public Float perimetre() {
        return null;
    }

    @Override
    public Float volumen() {
        return (float)(Math.PI*Math.pow(this.radio, 3))/4;
    }
    
}
