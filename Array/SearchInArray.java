package Array;

public class SearchInArray {
    public static void main(String[] args)
    {
        int[]arr={2,4,6,8,9,3,55};
        int search=55;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==search){
                System.out.println("Element found at index: " + i);
                break;
            }
            else {
                System.out.println("Element not found at index: " + i);
            }
        }
    }
}
