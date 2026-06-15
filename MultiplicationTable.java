import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int multiplier=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i + " * " + multiplier + " = " + i*multiplier );
        }
        sc.close();
    }
}
