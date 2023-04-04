package LabTwo;

import java.util.Scanner;

// If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
// If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
// If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
// The year is a leap year (it has 366 days).
// The year is not a leap year (it has 365 days).
public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {

                    System.out.println(year + "Is a leap year");
                } else {

                    System.out.println(year + "Is not a leap year");
                }
            } else {
                System.out.println(year + "Is a leap year");
            }
        } else {
            System.out.println(year + "Is not a leap year");
        }
    }
}
// why is both "enter a year" and the answer not on correct lines