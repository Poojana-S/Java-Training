import java.util.Scanner;

class StudentInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);

        sc.close();
    }
}