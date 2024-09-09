import java.util.*;
public class Q4 {
    public static void insert (int arr[]){
        Scanner sc= new Scanner (System.in);
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter the elements in an array at index "+i+" : ");
            arr[i]=sc.nextInt();
        }
    }

    public static int min_val_in_arr(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0 ;i <arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static int max_val_in_arr(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(largest<arr[i]){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] =new int[5];
        insert(num);
        System.out.println("largest number in an array : "+max_val_in_arr(num));
        System.out.println("smallest number in an array : "+min_val_in_arr(num));
    }
}
