import java.util.*;

public class Q2 {

    public static void largest(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+ " is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is the largest number");
        }
        else{
            System.out.println(c+ " is the largest number");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System .in);

        System.out.println("enter 3 numbers : ");
        System.out.print(" numbers 1 : ");
        int n1 = sc.nextInt();
        System.out.print(" numbers 2 : ");
        int n2 = sc.nextInt();
        System.out.print(" numbers 3 : ");
        int n3 = sc.nextInt();

        largest(n1, n2, n3);
    }
}
