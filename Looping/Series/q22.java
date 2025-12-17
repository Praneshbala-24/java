import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Buzz numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.print(i + " ");
            }
        }
    }
}
