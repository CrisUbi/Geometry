/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.triangles;

/**
 *
 * @author User
 */
public class Scalenetriangle extends Triangle{

    @Override
    public Float area() {
        return this.sideOne+this.sideTwo+this.sideThree;
    }

    @Override
    public Float perimetre() {
        float s=this.perimetre()/2;
        return (float)(Math.sqrt((s-this.sideOne)+(s-this.sideTwo)+(s-this.sideThree)));
    }
    
}
