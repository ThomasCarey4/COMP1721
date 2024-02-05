package ex;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double distanceMiles = input.nextDouble();
        double km = distanceMiles * 1.609;
        System.out.printf("%.2f miles is %.2f kilometers", distanceMiles, km);
    }
}
