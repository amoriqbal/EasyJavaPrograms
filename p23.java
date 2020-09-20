import java.util.*;
public class p23{
    public static void main(String[] args){
        int m,n,p;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of elements in the first array");
        m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("Enter the elements of the array one by one");
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the number of elements in the second array");
        n=sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the elements of the array one by one");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        p=m+n;
        int c[]=new int [p];

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            } else {
                c[k]=b[j];
                j++;
            }
            k++;
        }

        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }

        while(j<n){
            c[k]=b[j];
            j++;
            k++;
        }

        for(i=0;i<p;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}