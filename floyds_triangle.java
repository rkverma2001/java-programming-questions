import java.util.*;
public class floyds_triangle {

    public static void floyds_triangle_patttern(int n) {
        int counter = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        floyds_triangle_patttern(n);
    }
}
