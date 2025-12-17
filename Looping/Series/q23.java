import java.util.Scanner;
public class q23 {
    static boolean isMagic(int num) {
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Magic numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (isMagic(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
