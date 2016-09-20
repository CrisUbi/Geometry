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
public class Rombus extends Quadrialaterals {
    
    private Float SmallDiagonal;
    private Float BigDiagonal;

    public Rombus(Float SmallDiagonal, Float BigDiagonal, Float side) {
        super(side);
        this.SmallDiagonal = SmallDiagonal;
        this.BigDiagonal = BigDiagonal;
    }

    public Float getSmallDiagonal() {
        return SmallDiagonal;
    }

    public void setSmallDiagonal(Float SmallDiagonal) {
        this.SmallDiagonal = SmallDiagonal;
    }

    public Float getBigDiagonal() {
        return BigDiagonal;
    }

    public void setBigDiagonal(Float BigDiagonal) {
        this.BigDiagonal = BigDiagonal;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

 
    
    

    @Override
    public Float area() {
        return (SmallDiagonal*BigDiagonal);
    }

    @Override
    public Float perimetre() {
        return (float)(Math.pow(SmallDiagonal/2,2) + Math.pow(this.BigDiagonal/2,2)); // Terminar Bien la formula
    }
    
    
}
