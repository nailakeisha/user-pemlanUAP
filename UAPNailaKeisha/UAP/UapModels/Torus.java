package UAP.UapModels;

import UAP.Uapbases.Shape;
import UAP.UapInterface.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalcuable, MassConverter, ShippingCostCalculator{
    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius){
        super();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public Torus(){

    }

    @Override
    public double getVolume (){
        return 2 * Math.pow(PI, 2) * majorRadius * Math.pow(minorRadius, 2);
    }

    @Override
    public double getSurfaceArea(){
        return 4 * Math.pow(PI, 2) * majorRadius * minorRadius;
    }

    public double getMass(){
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    
    @Override
    public void printinfo(){
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
        System.out.println("Massa: " + getMass());

    }

    @Override
    public double gramToKilogram(){
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost(){
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }


}
