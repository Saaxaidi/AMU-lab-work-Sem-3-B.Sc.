import java.util.*;
public class Q6 {
    public static void linear_search(int n ,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("element "+n+" is at index "+i);
            }
        }
    }

    public static void insert(int arr[]){
        Scanner sc =new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the elements in array at index "+ i +" : " );
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String args[]){
        Scanner sm =new Scanner (System.in);
        int arr[] =new int [5];
        insert(arr);

        System.out.print("enter the number to find in the array : ");
        int n =sm.nextInt();

        linear_search(n, arr);
    }
}
