import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("Odd numbers till " + n + " are:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
