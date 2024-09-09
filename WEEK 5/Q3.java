import java.util.*;
public class Q3 {

    public static void insert (int arr[]){
        Scanner sc=new Scanner (System.in);
        for(int i=0 ;i<arr.length;i++){
            System.out.print("enter element in array at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
    }
    public static void display(int arr[]){
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    
    }

    public static void swap(int arr[]){
            int temp =arr[0];
            arr[0]=arr[arr.length-1];
            arr[arr.length-1]=temp;
    }

    public static void main(String args[]){
        int arr_to_swap[] = new int [10]; 
        insert(arr_to_swap);
        System.out.println("showing all the elements in an array : ");
        display(arr_to_swap);
        System.out.println();
        System.out.println("swap the first and last elements of an array");
        swap(arr_to_swap);
        display(arr_to_swap);
    }
}