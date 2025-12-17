import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many positive numbers (N): ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        System.out.println("Enter numbers:");
        while (count < n) {
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative number skipped. Enter another number.");
                continue;
            }
            sum += num;
            count++;
        }
        System.out.println("Sum of " + n + " positive numbers = " + sum);
    }
}
