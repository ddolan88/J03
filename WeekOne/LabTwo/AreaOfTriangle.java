package LabTwo;

// wont let my type the ints next to the promps and is not doing the math correctly
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scannerlength = new Scanner(System.in);
        Scanner scannerheight = new Scanner(System.in);

        System.out.println("Enter the base length: ");
        System.out.println("Enter the height: ");

        int length = scannerlength.nextInt();
        int height = scannerheight.nextInt();
        double result = (length * height) / 2;

        System.out.println("The area of the triangle is: " + result);

    }

}
