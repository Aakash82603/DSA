package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, -3};
        int target = 2;
        for(int i=0; i<nums.length; i++){
            int x=target -nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(x==nums[j]){
                    System.out.println(nums[i]+" "+nums[j]);
                }
            }
        }
    }
}
