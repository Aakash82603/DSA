package HashMap;

import java.util.HashMap;

public class countRepetedNumber {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0) +1);
        }
        for(int n:count.keySet()){
            System.out.println(n + ": " + count.get(n));
        }

    }
}
