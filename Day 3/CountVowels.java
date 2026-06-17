import java.util.Scanner;

public class CountVowels {
    public static void main(String args[]){
        int count=0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                count++;
            }
        }
        System.out.println("No. of vowels: " + count);    
        sc.close();
    }
}
