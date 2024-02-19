package StringConcept;

public class PalidromeORNot {
    public static boolean isPalidrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // Not palidrome
                return false;
            }
        }
        // Palidrome
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalidrome(str));
    }
}
