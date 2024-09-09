import java.util.*;
public class Q2 {
    public static void insert(int arr[]){
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("element at index " +i+ " : ");
            arr[i]=sc.nextInt();
        }
    }
    public static int sum(int arr[]){
        int sum = 0 ;
        for(int i =0; i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int num [] =new int[10];
        insert(num);
        System.out.println("the sum of all the arr elements : "+sum(num));
    }
}
