public class StringFunctions {
    public static void main(String[] args) {
        String s1 = "  Hello Java Programming  ";
        String s2 = "World";
        // 1. length()
        System.out.println("Length: " + s1.length());
        // 2. charAt()
        System.out.println("Character at index 6: " + s1.charAt(6));
        // 3. concat()
        System.out.println("Concat: " + s1.concat(s2));
        // 4. copy()
        String s3 = s1;
        System.out.println("Copy: " + s3);
        // 5. toString()
        System.out.println("toString: " + s1.toString());
        // 6. substring()
        System.out.println("Substring: " + s1.substring(2, 7));
        // 7. toUpperCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        // 8. toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());
        // 9. equals()
        System.out.println("Equals: " + s1.equals(s2));
        // 10. trim()
        System.out.println("Trim: " + s1.trim());
        // 11. split()
        String[] words = s1.trim().split(" ");
        System.out.println("Split:");
        for(String word : words) {
            System.out.println(word);
        }
        // 12. startsWith()
        System.out.println("Starts with Hello: " + s1.trim().startsWith("Hello"));
        // 13. endsWith()
        System.out.println("Ends with Programming: " + s1.trim().endsWith("Programming"));
        // 14. replace()
        System.out.println("Replace: " + s1.replace("Java", "Python"));
        // 15. contains()
        System.out.println("Contains Java: " + s1.contains("Java"));
    }
}