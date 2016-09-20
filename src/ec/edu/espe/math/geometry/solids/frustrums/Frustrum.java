/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.frustrums;

import ec.edu.espe.math.geometry.circumferences.Ellipse;

/**
 *
 * @author User
 */
public class Frustrum extends Ellipse implements FrustumSolid{
    private Float height;

    public Frustrum(Float radioTwo, Float radio) {
        super(radioTwo, radio);
    }

    @Override
    public Float volumen() {
        return null;
    }


}
