package uap.bases;

import uap.interfaces.*;

public abstract class CetakanDonat implements Calculable, Convertible, Printable{
    protected static final double PI = 22.0 / 7.0;
    protected static final double DENSITY_STAINLESS_STEEL = 8.0; 
    protected static final double KETEBALAN = 0.5; 
    protected static final int BIAYA_KIRIM_PER_KG = 15000; 
    
    protected double radius;

    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();

     @Override
    public double konversiKeKg() {
        return hitungMassa() / 1000.0;
    }
    
    @Override
    public String hitungBiayaKirim() {
        double massaKg = konversiKeKg();
        int massaBulat = (int) Math.ceil(massaKg);
        int totalBiaya = massaBulat * BIAYA_KIRIM_PER_KG;
        return String.format("Rp%,d", totalBiaya);
    }
    
    public CetakanDonat(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double hitungMassa() {
        return hitungVolume() * DENSITY_STAINLESS_STEEL;
    }

   
    @Override
    public void printInfo() {
        System.out.println("Volume : " + String.format("%.2f", hitungVolume()) + " cm³");
        System.out.println("Luas permukaan : " + String.format("%.2f", hitungLuasPermukaan()) + " cm²");
        System.out.println("Massa : " + String.format("%.2f", hitungMassa()) + " gr");
        System.out.println("Massa dalam kg : " + String.format("%.3f", konversiKeKg()) + " kg");
        System.out.println("Biaya kirim : " + hitungBiayaKirim());
    }
    
   
}