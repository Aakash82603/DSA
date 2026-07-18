package Array;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] nums={ 1,1,0,2,0,1,2,0,2};
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
