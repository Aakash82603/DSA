package Array;
import java.util.*;

public class MaximumSumOfSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        HashSet<Integer> set = new HashSet<>();
        int k = 3;
        int maxSum=0;


        for(int i=0; i<k; i++){
            set.add(nums[i]);
                maxSum += nums[i];

        }
        int windowSum=0;
        if(set.size()==k){
            windowSum=maxSum;
        }
        for(int j=k; j<nums.length; j++){
            set.remove(nums[j-k]);
            maxSum -= nums[j-k];
            set.add(nums[j]);
            maxSum += nums[j];
            if(set.size()==k){
                windowSum = Math.max(maxSum, windowSum);
            }
        }
        System.out.println(windowSum);
    }
}



