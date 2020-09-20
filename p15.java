import java.util.*;

public class p15{
    public static void main(String[] args){
        int n;
        int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        if(n<2){
            System.out.println("Size must be greater than 1");
            return;
        }
        arr=new int[n];
        System.out.println("Enter the array elements one by one");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max1,max2;

        max1=(arr[0]<arr[1]?arr[1]:arr[0]);
        max2=(arr[0]>arr[1]?arr[1]:arr[0]);

        for(int i=2;i<n;i++){
            if(max1==max2){
                max1=(arr[i]>max1?arr[i]:max1);
                max2=(arr[i]<max2?arr[i]:max2);
                continue;
            }

            if(arr[i]>=max1){
                max2=max1;
                max1=arr[i];
            } else if(arr[i]>=max2){
                max2=arr[i];
            }
        }

        System.out.println("Second largest:"+max2);
    }
}