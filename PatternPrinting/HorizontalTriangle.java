package PatternPrinting;

public class HorizontalTriangle {
    public static void main(String[] args) {
        for(int i=0; i<=4; i++){
            for(int j=1; j<=4+1-i; j++){
              //  System.out.print("* ");
              //  System.out.print("  " + (char)(j + 64));
                System.out.print(" " +j);
            }
            System.out.println();
        }
    }
}
