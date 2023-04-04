package LabTwo;

import java.util.Scanner;

// why does it not prompt me to type on the same line as the question?
public class AreaCircumferance {
    // Area = pi * r * r
    // Circumference = r * r
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();

        System.out.println("Area of the circle is: " + Math.PI * Math.pow(radius, 2));
        System.out.println("Circumference of the circle is: " + Math.pow(radius, 2));
        scanner.close();
    };
}
