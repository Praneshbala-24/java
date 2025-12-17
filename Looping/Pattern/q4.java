import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 15;
        for (int i = n; i >= 1; i--) {
            for (int a = 0; a < n - i; a++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
