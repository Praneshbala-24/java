import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Whole numbers till " + n + " are:");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
