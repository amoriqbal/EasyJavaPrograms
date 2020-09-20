import java.util.*;

public class p20 {
    public static void main(String[] args){
        int r,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in first matrix");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix a=new Matrix(r,c);
        a.acceptVals();

        System.out.println("Enter the number of rows and columns in second matrix");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix b=new Matrix(r,c);
        b.acceptVals();
        
        Matrix z=Matrix.sub(a,b);
        z.display();
    }
}

class Matrix{
    int rows,cols;
    int vals[][];
    public Matrix(int r, int c){
        rows=r;
        cols=c;
        vals=new int[r][c];
    }

    public int[] size(){
        int sz[]={rows,cols};
        return sz;
    }

    public int[][] values(){
        return vals;
    }

    public void acceptVals(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values one by one.");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                vals[i][j]=sc.nextInt();
            }
        }
    }

    public static Matrix sub(Matrix a, Matrix b){
        int m,n,p,q;
        m=a.size()[0];
        n=a.size()[1];
        p=b.size()[0];
        q=b.size()[1];

        Matrix res=new Matrix(m,q);
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                res.values()[i][j]=a.values()[i][j]-b.values()[i][j];
            }
        }
        return res;
    }

    public void display(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(vals[i][j]+ "\t");
            }
            System.out.println();
        }
    }
};