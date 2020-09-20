import java.util.*;

public class p16{
    public static void main(String[] args){
        int n;
        int s=0;
        int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the array elements one by one");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            {
                s++;
            }
        }

        System.out.println("The number of non-zero elements is: "+s);
    }
}