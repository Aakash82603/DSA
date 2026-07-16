package Array;

import java.util.Scanner;

public class MaxElement {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            int element = sc.nextInt();
            if(element > max){
                max = element;
            }
            if(element < min){
                min = element;
            }
        }
        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is: " + min);
    }
}
