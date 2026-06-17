public class StringComparision {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");
        // Comparing using ==
        System.out.println(s1 == s2); // true (same string pool reference)
        System.out.println(s3 == s4); // false (different objects)
        // Comparing using equals()
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true
    }
}