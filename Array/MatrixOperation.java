package Array;

import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        System.out.println("Enter the elements of the matrix 1.");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrix 2.");
        int[][] arr2 = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of the two matrix");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Difference of the two matrix");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] - arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Product of the two matrix");
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] * arr2[i][j] + " ");
            }
            System.out.println();

        }

    }
}
