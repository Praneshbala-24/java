import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("Powers of 2 between 1 and " + n + " are:");

        int power = 1; // 2^0

        while (power <= n) {
            System.out.print(power + " ");
            power = power * 2;
        }
    }
}
