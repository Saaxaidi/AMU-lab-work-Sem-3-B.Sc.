import java.util.*;
public class WEEK1Q5 {
    public static int DISTANCE(int a, int b){
        int d =(int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        return d;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("point 1 : ");
        int a = sc.nextInt();
        System.out.print("point 2 : ");
        int b = sc.nextInt();
        int ans = DISTANCE(a, b);
        System.out.println("distance between two points :"+ans);
    }
}
