import java.util.*;

public class p18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int la;
        int a[],b[],c[];
        System.out.println("Enter the size of the arrays");
        la=sc.nextInt();
        a=new int[la];
        b=new int[la];
        c=new int[la];
        System.out.println("Enter the elements of first array one by one");

        for(int i=0;i<la;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the elements of second array one by one");

        for(int i=0;i<la;i++){
            b[i]=sc.nextInt();
        }

        for(int i=0;i<la;i++){
            c[i]=a[i]+b[i];
        }
        for(int i=0;i<la;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}