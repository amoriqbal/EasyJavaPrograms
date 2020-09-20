import java.util.*;

public class p13 {
    public static void main(String[] args){
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix arr=new Matrix(r,c);
        arr.acceptVals();
        if(arr.isSparse()){
            System.out.println("The matrix is sparse!");
        } else {
            System.out.println("The matrix is not sparse!");
        }
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

    public boolean isSparse(){
        int a=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(vals[i][j]!=0){
                    a++;
                }
            }
        }

        if(a<Math.sqrt(rows*cols)){
            //sparse
            return true;
        }

        //not sparse
        return false;
    }
};