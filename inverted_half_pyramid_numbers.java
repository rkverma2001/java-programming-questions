import java.util.*;
public class inverted_half_pyramid_numbers {

    public static void inverted_pyramid_numbers(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        inverted_pyramid_numbers(n);
    }
}
