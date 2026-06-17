import java.util.Scanner;

public class RemoveEmptySpace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        String[] word=s.split(" ");
        for(String w : word){
            System.out.print(w);
        }
        
        sc.close();
    }
}
