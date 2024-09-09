import java.util.*;
public class WEEK1Q4 {
    public static int CALCULATOR(int a, int b, int c){
        int average= (a+b+c)/3;
        return average;
    }
    
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("a : ");
        int a =sc.nextInt();
        System.out.print("b : ");
        int b =sc.nextInt();
        System.out.print("c : ");
        int c =sc.nextInt();
        int ans = CALCULATOR(a, b, c);
        System.out.println("average = "+ans);

    }
}
