package ex;

import java.util.Scanner;

public class Spheroid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter equatorial radius in km: ");
        double radiusKm = input.nextDouble();
        System.out.print("Enter polar radius in km: ");
        double polarKm = input.nextDouble();
        input.close();
        double eccentricity = Math.sqrt(1 - (Math.pow(polarKm, 2) / Math.pow(radiusKm, 2)));
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 2) * polarKm;
        System.out.printf("Eccentricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %.5g km^3", volume);
    }
}
