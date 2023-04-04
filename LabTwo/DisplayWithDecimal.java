package LabTwo;

import java.util.Scanner;

public class DisplayWithDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.printf("the new value is %.1f\n", num);

    }
}
