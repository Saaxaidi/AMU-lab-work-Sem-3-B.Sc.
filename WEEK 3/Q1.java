import java.util.*;
public class Q1{
    public static void  odd_even(int number){
        if(number%2==0){
            System.out.println(number+ " is an even number");
        }
        else{
            System.out.println(number+" is an odd number");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number : ");
        int n =sc.nextInt();
        odd_even(n);
    }
}