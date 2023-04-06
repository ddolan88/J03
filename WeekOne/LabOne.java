package LabOne;

public class LabOne {
    // seeing if I can access these in another method
    static int num1 = 20, num2 = 25, num3 = 3, k = 6, n = 3;

    public static void main(String[] args) {
        maxThree(num1, num2, num3);
        minThree(num1, num2, num3);
        middleThree(num1, num2, num3);
        xor(false, false);
        isFactor(k, n);
        isPerfect(k); // WTF
        isPrime(k);

    }

    public static int maxThree(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the maximum number.");
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum number.");
            return num2;
        } else
            System.out.println(num3 + " is the maximum number.");
        return num3;
    }

    public static int minThree(int num1, int num2, int num3) {

        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is the minimum number.");
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the minimum number.");
            return num2;
        } else
            System.out.println(num3 + " is the minimum number.");
        return num3;
    }

    public static int middleThree(int num1, int num2, int num3) {
        int total = num1 + num2 + num3;
        int middle = total - (minThree(num1, num2, num3)) - (maxThree(num1, num2, num3));
        System.out.println(middle + " is the middle number.");
        return middle;
    }

    public static boolean xor(boolean booleanOne, boolean booleanTwo) {
        if (booleanOne == (booleanOne | booleanTwo)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean isFactor(int k, int n) {
        if (k % n == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void IsPerfect(int k) {

        int sum = 0;
        for (int i = 1; i < k; i++) {
            if (isFactor(k, i)) {
                sum += i;
            }
        }
        System.out.println(sum == k);
    }

    public static boolean isPrime(int k) {
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i < k / 2; i++) {
            if (isFactor(k, i)) {
                System.out.println(false);
                return false;
            }

        }
        System.out.println(true);
        return true;

    }

}
