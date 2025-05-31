package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAILA KEISHA SASONGKO");
        System.out.println("245150707111054");
        System.out.println("=============================================");
        
        // Torus
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan Radius : ");
        double radiusBesar = scanner.nextDouble();
        
        System.out.print("Isikan radius : ");
        double radiusKecil = scanner.nextDouble();
        
        System.out.println("=============================================");
        
        Torus donatDenganLubang = new Torus(radiusBesar, radiusKecil);
        donatDenganLubang.printInfo();
        
        System.out.println("=============================================");
        
        // Sphere
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        
        System.out.print("Isikan radius : ");
        double radiusBola = scanner.nextDouble();
        
        System.out.println("=============================================");
        
        Sphere donatTanpaLubang = new Sphere(radiusBola);
        donatTanpaLubang.printInfo();
        
        System.out.println("=============================================");
        
        scanner.close();
    }
}

