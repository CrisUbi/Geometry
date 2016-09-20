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
public class Rectangle extends Quadrialaterals {
 
    Float Side2;

    public Rectangle(Float Side2, Float side) {
        super(side);
        this.Side2 = Side2;
    }


    
    
    @Override
    public Float area() {
       return this.side*this.Side2;
    }

    @Override
    public Float perimetre() {
        return this.Side2*2+this.side;
    }
    
    // implemetar el hash code y el equals
    
    
    
}
