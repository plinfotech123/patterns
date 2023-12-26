package patterns.Rectangle;

public class RectangleWithNumber {
    public static void main(String[] args) {

        int n=3, m=4, number=1;
        // outer loop
        for(int i=1;i<=n; i++){
            // inner loop
            for(int j=1; j<=m; j++){
                //System.out.print(i);
               // System.out.print(j);
               System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
