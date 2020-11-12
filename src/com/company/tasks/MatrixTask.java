package com.company.tasks;
import java.util.Arrays;
import java.util.Objects;
import com.company.addons.MatrixAddon;
public class MatrixTask {

    private int matrix[][];
    private int N;
    private int M;

    public MatrixTask(int n) {
        int temp=0;
        this.N = n;
        this.M = n;
        matrix = new int[N][N];
        for (int i = 0; i < N; ++i)
        for (int j = 0; j < N; ++j)
        {
            temp++;
            matrix[i][j] = temp;
        }
    }

    public MatrixTask(int n, int m, int matrix[][]) {
        this.N = n;
        this.M = m;
        this.matrix = matrix;
    }

    public MatrixAddon calculate() {
        int sum = 0;
        double avr;
        int res=matrix[0][0];
        double tmp;
        MatrixAddon addon=new MatrixAddon(0,0);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum+= matrix[i][j];
            }
        }
        avr=sum/(N*M);
        tmp=Math.abs(matrix[0][0]-avr);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (Math.abs(matrix[i][j]-avr)<tmp){
                    tmp=Math.abs(matrix[i][j]-avr);
                    addon.i=i;
                    addon.j=j;
                    res=matrix[i][j];
                }
            }
            }
//        System.out.printf("Sum->%d",sum);
//        System.out.printf("\nAVR->%f",avr);
//        System.out.printf("\nNumber->%d",res);
        return addon;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        String res="";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res+=matrix[i][j] + "\t";
            }
            res+="\n";
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatrixTask that = (MatrixTask) o;
        return N == that.N &&
                M == that.M &&
                Arrays.equals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(N, M);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }
}

