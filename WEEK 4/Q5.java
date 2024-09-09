import java .util.*;
public class Q5 {
    public static int sum(int n ){
        int sum =0;
        while(n>0){
            int lastDigit = n%10;
            sum +=lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("sum : "+sum(num));
    }
}
