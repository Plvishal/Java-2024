package StringConcept;

public class PrintingSingleLetterString {
    public static void printLetter(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "vishal pal";
        // Finding the single character in the string
        System.out.println(str.charAt(2));
        printLetter(str);
    }

}
