import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isDescending = true;
        int prevDigit = -1; 
        while (num > 0) {
            int digit = num % 10;
            if (digit < prevDigit) {
                isDescending = false;
                break;
            }
            prevDigit = digit;
            num /= 10;
        }
        if (isDescending) {
            System.out.println("Digits are in descending order.");
        } else {
            System.out.println("Digits are NOT in descending order.");
        }
        sc.close();
    }
}
