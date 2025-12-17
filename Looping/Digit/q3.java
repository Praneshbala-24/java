import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit to check: ");
        int digit = sc.nextInt();
        num = Math.abs(num);   // handle negative numbers
        boolean found = false;
        while (num > 0) {
            if (num % 10 == digit) {
                found = true;
                break;
            }
            num = num / 10;
        }
        if (found) {
            System.out.println("Digit " + digit + " is present in the number.");
        } else {
            System.out.println("Digit " + digit + " is not present in the number.");
        }
        sc.close();
    }
}
