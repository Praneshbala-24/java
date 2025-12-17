import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();
        num = Math.abs(num); 
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Digit " + digit + " occurs " + count + " times.");
        sc.close();
    }
}
