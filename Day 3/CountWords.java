import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        s=s.trim();
        String[] word = s.split(" ");

        System.out.print("Total words: " + word.length);
        sc.close();
    }
}