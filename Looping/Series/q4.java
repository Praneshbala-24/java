import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Even numbers till " + n + " are:");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
