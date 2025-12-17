import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Perfect numbers between 1 and " + n + " are:");
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num && num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
