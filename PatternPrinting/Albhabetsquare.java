package PatternPrinting;

public class Albhabetsquare {
    public static void main(String[] args) {
        for(int j=0;j<4;j++){
            for(int k=0;k<4;k++){
                System.out.print(" " + (char)(k + 97));
            }
            System.out.println();
        }
    }
}
