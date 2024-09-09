import java.util.*;
public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        while (n >= 10) {
            n = n / 2;
            System.out.println(n);
        }

    }
}
