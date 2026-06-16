import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String args[]){
        System.out.println("1-D Array");
        int[] arr = {10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Length of Array: " + arr.length);
        System.out.println("Length of Array 1: " + arr1.length);
        sc.close();
    }
}
