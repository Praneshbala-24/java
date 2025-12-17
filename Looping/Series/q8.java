import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("First " + n + " even numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }
    }
}
