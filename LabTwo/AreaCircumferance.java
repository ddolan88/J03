import java.util.Scanner;

package LabTwo;

public class AreaCircumferance {
    // Area = pi * r * r
    // Circumference = r * r
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double = radius = scanner.nextDouble();

        System.out.println("Area of the circle is: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Circumference of the circle is: " + Math.pow(radius, 2));
        scanner.close();
    };
}
