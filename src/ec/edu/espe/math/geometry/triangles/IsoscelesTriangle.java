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
public class IsoscelesTriangle extends RightAngleTriangle{

    public IsoscelesTriangle(Float base, Float height) {
        super(base, height);
    }
    
    @Override
    public Float perimetre() {
        return (this.base*this.height)/2;
    }
    
}
