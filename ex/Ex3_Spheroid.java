package ex;

import java.util.Scanner;

public class Ex3_Spheroid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter equatorial radius in km: ");
        double radiusKm = input.nextDouble();
        if (radiusKm <= 0) {
            System.out.println("Error: equatorial radius must be " +
                    "larger than 0");
            System.exit(1);
        }
        System.out.print("Enter polar radius in km: ");
        double polarKm = input.nextDouble();
        if (polarKm <= 0) {
            System.out.println("Error: polar radius must be larger than 0");
            System.exit(1);
        }
        input.close();
        if (polarKm > radiusKm) {
            System.out.println("Error: equatorial radius must be " +
                    "larger than polar radius");
            System.exit(1);
        }
        double eccentricity;
        eccentricity = Math.sqrt(1 - (Math.pow(polarKm, 2) / Math.pow(radiusKm, 2)));
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 2) * polarKm;
        System.out.printf("Eccentricity = %.3f\n", eccentricity);
        System.out.printf("Volume = %.5g km^3", volume);
    }
}
