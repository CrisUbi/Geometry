/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.quadrilaterals;

/**
 *Corregir los herrores
 * @author Labs-DECC
 */
public class Trapezoid extends Quadrialaterals {

    Float sideSmall;

    public Trapezoid(Float sideSmall, Float side) {
        super(side);
        this.sideSmall = sideSmall;
    }

    public Float getSideSmall() {
        return sideSmall;
    }

    public void setSideSmall(Float sideSmall) {
        this.sideSmall = sideSmall;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }
   
    
    @Override
    public Float area() {
       return  this.side*this.sideSmall;
    }

    @Override
    public Float perimetre() {
        return  2*(this.sideSmall+this.side);
    }
    
}
