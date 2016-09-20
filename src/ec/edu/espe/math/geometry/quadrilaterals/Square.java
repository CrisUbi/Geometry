/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.quadrilaterals;

/**
 *
 * @author Labs-DECC
 */
public class Square extends Quadrialaterals {

    public Square(Float side) {
        super(side);
    }

    @Override
    public Float area() {
        return this.side*this.side;
    }

    @Override
    public Float perimetre() {
        return this.side*4;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }
    
    
   
    
}
