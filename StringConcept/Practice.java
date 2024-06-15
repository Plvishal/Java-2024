package StringConcept;

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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println(countVowel(str));

    }
}
