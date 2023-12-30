package patterns.Diamond;

public class DiamondExample {
    public static void main(String[] args) {
        int n=7;
        // upper outer loop
        for(int i=1; i<=n; i++){
            // upper inner loop
            // for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for the star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        // outer loop
        for(int i=n; i>=1; i--){
            // inner loop
            // for the space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for the star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
