package Basic;
import java.util.Scanner;

public class CheckingDivisible {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int a = sc.nextInt();
       int b = 5;
       if(a%b==0)
           System.out.println("Divisible by 5");
       else
           System.out.println("Not Divisible by 5");
    }
}
