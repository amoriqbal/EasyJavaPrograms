import java.util.*;

public class p21{
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

        int num[]=new int[n];
        int freq[]=new int[n];
        int l=0;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<l;j++){
                if(arr[i]==num[j])
                {
                    flag=true;
                    freq[j]++;
                }
            }
            if(!flag){
                num[l]=arr[i];
                freq[l]=1;
                l++;
            }
        }
        if(l==n){
            System.out.println("There are no duplicate items");
        } else {
            System.out.println("Duplicate items and their frequencies:");
            for(int i=0;i<l;i++){
                if(freq[i]>1)
                    System.out.println("Num:"+num[i]+"\tFrequency:"+freq[i]);
            }
        }        
    }
}