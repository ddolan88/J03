package LabThree;

public class labThree {
    static String oldString = "Average";
    static String doubleString = "Mississippi";
    static String str = "Java";

    public static void main(String[] args) {
        sortString(oldString);
        isDuplicate(doubleString);
        countInString(str);
        repeatChar(oldString);
    }

    public static String sortString(String oldString) {
        String output = "";

        for (int i = 0; i < oldString.length(); i++) {
            char testChar = oldString.charAt(i);
            if (testChar != 'a' && testChar != 'A') {
                output += testChar;
            }
        }
        System.out.println(output);
        return output;
    }

    public static void isDuplicate(String doubleString) {
        String base = doubleString.toLowerCase();
        String excess = "";
        String output = "";

        for (int i = 0; i < doubleString.length(); i++) {
            if (base.charAt(i) == doubleString.charAt(i)) {
                excess = excess += base.charAt(i);
            } else
                output = output + doubleString.charAt(i);
        }
        System.out.println(output);
    }

    public static void countInString(String str) {
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else
                cCount++;
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }

    public static void repeatChar(String doubleString) {
        String base = doubleString.toLowerCase();
        String excess = "";
        String doubles = "";
        String output = "";

        for (int i = 0; i < doubleString.length(); i++) {
            if (base.charAt(i) == doubleString.charAt(i)) {
                excess = excess += base.charAt(i);
                {
                    for (int j = 0; j < oldString.length(); j++) {
                        char testChar = oldString.charAt(i);
                        if (testChar == 'a' && testChar == 'A')
                            doubles += testChar;
                    }
                }
            }
            output = output + base.charAt(i);
        }
        System.out.println(excess + doubles);
    }
}
