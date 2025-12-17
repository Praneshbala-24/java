import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter positive numbers (enter a negative number to stop):");
        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                break;
            }

            sum += num;
        }
        System.out.println("Sum of entered positive numbers = " + sum);
    }
}
