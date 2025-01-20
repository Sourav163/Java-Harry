package Java_Harry;

import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] T = new int[10][10];
        int nz = 0, k = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows :  ");
        int row = s.nextInt();
        System.out.println("Enter The Number Of Cols :  ");
        int col = s.nextInt();
        int[][] S = new int[row][col];
        T[0][0] = row;
        T[0][1] = col;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter The Value Of S[%d][%d] :  ", i, j);
                S[i][j] = s.nextInt();
                if (S[i][j] != 0) {
                    T[k][0] = i;
                    T[k][1] = j;
                    T[k][2] = S[i][j];
                    k++;
                    nz++;
                }
            }
        }
        T[0][2] = nz;
        System.out.print("Sparse Matrix :");
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(S[i][j] + "\t");
            }
        }
        System.out.print("\nTriplet Format :");
        for (int i = 0; i <= nz; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t", T[i][j]);
            }
        }
        s.close();
    }
}