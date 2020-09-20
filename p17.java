import java.util.*;
public class p17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int la,lb,lc;
        float a[],b[],c[];
        System.out.println("Enter the size of the first array");
        la=sc.nextInt();
        a=new float [la];
        System.out.println("Enter the array elements one by one");

        for(int i=0;i<la;i++){
            a[i]=sc.nextFloat();
        }

        System.out.println("Enter the size of the second array");
        lb=sc.nextInt();
        b=new float[lb];
        System.out.println("Enter the array elements one by one");

        for(int i=0;i<lb;i++){
            b[i]=sc.nextFloat();
        }
        lc=la+lb;
        c=new float[lc];
        int j=0;
        for(int i=0;i<la;i++){
            c[j]=a[i];
            j++;
        }
        for(int i=0;i<lb;i++){
            c[j]=b[i];
            j++;
        }

        for(int i=0;i<lc;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}