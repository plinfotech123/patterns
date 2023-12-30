package patterns.Pyramid;

public class PalendromicPyramid {
    public static void main(String[] args) {
        int n=7;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            // for the space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for the number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // right side
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
