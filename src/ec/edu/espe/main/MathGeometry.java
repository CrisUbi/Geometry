/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.main;

import ec.edu.espe.math.geometry.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.quadrilaterals.Square;
import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;

/**
 *
 * @author Labs-DECC
 */
public class MathGeometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //QUADRILATERALS
        Square square =new Square(5f);
        PrinterUtil.printShape(square.getClass().getSimpleName(),GeometricConstants.PERIMETER,square.perimetre());
        PrinterUtil.printShape(square.getClass().getSimpleName(),GeometricConstants.AREA,square.area());
        
        
        Rectangle rectangle=new Rectangle(6f,5f);
        PrinterUtil.printShape(rectangle.getClass().getSimpleName(),GeometricConstants.PERIMETER,rectangle.perimetre());
        PrinterUtil.printShape(rectangle.getClass().getSimpleName(),GeometricConstants.AREA,rectangle.area());
    }
    
}
