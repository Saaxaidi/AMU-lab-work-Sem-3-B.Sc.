import java.util.*;
public class Q1{
    public static void insert(int arr[]){
        Scanner sc=new Scanner (System.in);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("elements at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
    }
    public static void display(int arr[]){
        System.out.println("display all the elements in given arr : ");
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
    int num[]= new int[10];
    insert(num);
    display(num);
    }
}