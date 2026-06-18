import java.util.Scanner;
public class ArithmeticException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        try {
            System.out.println("a/b = " + (a / b));
        } catch (Exception e) {
            System.err.println("Exception caught: " + e);
        } finally {
            System.out.println("Completed!");
            sc.close();
        }
    }
}