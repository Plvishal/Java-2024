import java.util.HashSet;
import java.util.Set;

public class DuplicateselementArray {
    public static void main(String[] args) {
        String names[] = { "Java", "Python", "Ruby", "JavaScript", "Java" };

        // for (int i = 0; i < names.length; i++) { // O(n2) worst solution
        // for (int j = i + 1; j < names.length; j++) {
        // if (names[i].equals(names[j])) {
        // System.out.println("Duplicates Element is : " + names[i]);
        // }
        // }
        // }

        // Using HashSet: Java Collection it stores unique values

        Set<String> store = new HashSet<String>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("Duplicate element is :: " + name);
            }
        }
    }
}
