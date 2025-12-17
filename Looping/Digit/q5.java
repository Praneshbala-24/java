import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isAscending = true;
        int prevDigit = 10; 
        while (num > 0) {
            int digit = num % 10;
            if (digit > prevDigit) {
                isAscending = false;
                break;
            }
            prevDigit = digit;
            num /= 10;
        }
        if (isAscending) {
            System.out.println("Digits are in ascending order.");
        } else {
            System.out.println("Digits are NOT in ascending order.");
        }

        sc.close();
    }
}
