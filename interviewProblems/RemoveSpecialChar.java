public class RemoveSpecialChar {
    public static void main(String args[]) {
        String s = "Vishal 9155564";
        // Regular Expression :[^a-zA-Z]
        s = s.replaceAll("[^a-zA-Z]", "");
        System.out.println(s);
    }
}
