import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int num = 1; num <= n; num++) {
            int temp = num;
            int sum = 0;
            int digits = 0;
            int t = num;
            while (t != 0) {
                digits++;
                t /= 10;
            }
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}