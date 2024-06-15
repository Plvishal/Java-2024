package StringConcept;

import java.lang.reflect.Array;
import java.util.*;

public class Practice {
    // Question 1: Count how many times lowercase vowels occured in a strings
    // entered by the user
    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                count++;
            } else if (ch == 'e') {
                count++;
            } else if (ch == 'i') {
                count++;
            } else if (ch == 'o') {
                count++;
            } else if (ch == 'u') {
                count++;
            }

        }
        return count;

    }

    public static void checkAngram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            // Convert strings into cahar arrays
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();
            // sort the char arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are angram of each other");
            } else {
                System.out.println(str1 + " and " + str2 + "are not angram of each other");
            }
        } else {
            System.out.println(str1 + " and " + str2 + "are not angram of each other");
        }
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Strings: ");
        // String str = sc.nextLine().toLowerCase();
        // System.out.println(countVowel(str));
        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        String str1 = "eart";
        String str2 = "heart";
        checkAngram(str1, str2);

    }
}
