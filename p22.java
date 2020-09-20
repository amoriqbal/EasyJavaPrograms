import java.util.*;

public class p22{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the numbers one by one");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
