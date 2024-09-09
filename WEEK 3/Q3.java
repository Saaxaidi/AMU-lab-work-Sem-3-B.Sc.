import java.util.*;
public class Q3 {

    public static void Table(int n){
        for(int i=1;i<=10;i++){
            int m =n*i;
            System.out.println(m);
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.print("number : ");
        int n =sc.nextInt();
        Table(n);
    }
}
