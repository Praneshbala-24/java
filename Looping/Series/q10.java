import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers (N): ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 1; i <= n; i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum of given numbers = " + sum);
    }
}
