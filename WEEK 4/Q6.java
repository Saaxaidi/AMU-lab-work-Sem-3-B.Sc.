import java.util.*;
public class Q6 {
    public static int factorial(int n){
        int fact = 1 ;
        for(int i =1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the Number : ");
        int num =sc.nextInt();
        System.out.println("factorial :" +factorial(num));
    }
}
