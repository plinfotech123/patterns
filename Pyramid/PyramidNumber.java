package patterns.Pyramid;

public class PyramidNumber {
    public static void main(String[] args) {
        int n=7;
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            // for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for the number
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
