package Array;

public class OddEvenOperation {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,8,9,4};
        for(int i=0; i<arr.length; i++){
            if(i%2==1) {
                System.out.println(arr[i] *2 + " is odd");
            }
            else {
                System.out.println(arr[i]+10 + " is even");
            }

        }


    }
}
