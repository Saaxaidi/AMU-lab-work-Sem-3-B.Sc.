import java.util.*;
public class Q2 {
    public static void prime(int n){
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        }
        if(n==2){
            System.out.println(n+ " is a prime number");
        }
        else{
            boolean isPrime= true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc  =new Scanner (System.in);
        System.out.print("enter the number : ");
        int num =sc.nextInt();
        prime(num);
    }
}
