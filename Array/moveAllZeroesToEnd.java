package Array;

import java.util.Arrays;

public class moveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] nums={1,2,0,4,3,0,5,0};
        int[] result = moveAllZerosToEnd(nums);

        System.out.println(Arrays.toString(result));

    }
    public static int[] moveAllZerosToEnd(int[] nums) {
        int left=0;
        for(int right=0; right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        return nums;
    }
}
