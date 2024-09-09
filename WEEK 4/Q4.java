import java.util.*;
public class Q4 {
    public static double sum_of_series(int n){
        double sum =0.0;
        for(int i = 1 ; i<=n ; i++){
            sum +=(1.0/i);
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num =sc.nextInt();
        System.out.println("Sum : "+sum_of_series(num));
    }
}
