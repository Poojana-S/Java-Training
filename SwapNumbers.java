import java.util.*;
public class SwapNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(n1 + " " + n2);
        System.out.println("After Swap");
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1 + " " + n2);
    }
}
