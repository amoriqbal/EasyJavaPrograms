import java.util.*;

public class p14{
    public static void main(String[] args){
        int n;
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
            if(isPrime(arr[i])){
                System.out.println(arr[i] + " is prime");
            } else {
                System.out.println(arr[i] + " is not prime");
            }
        }
    }

    public static boolean isPrime(int a){
        if(a<1){
            return false;
        }
        int f=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                f++;
            }
        }

        if(f==2){
            return true;
        }

        return false;
    }
}