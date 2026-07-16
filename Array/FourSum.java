package Array;

import java.util.Scanner;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int target=8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println("The four elements are: " + arr[i] + ", " + arr[j] + ", " + arr[k] + ", " + arr[l]);

                        }
                        else {
                            System.out.println("No four elements found that sum to the target value.");
                        }
                    }
                }
            }
        }
    }
}

