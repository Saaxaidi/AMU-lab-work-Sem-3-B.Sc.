import java.util.*;
public class Q4 {
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum : "+sum);
    }
}
