import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int lastDigit = num % 10;
        int firstDigit = 0;
        int digits = 0;
        while (num > 0) {
            firstDigit = num;
            num /= 10;
            digits++;
        }
        int power = (int) Math.pow(10, digits - 1);
        int swappedNum =
                lastDigit * power +
                (originalNum % power) / 10 * 10 +
                firstDigit;
        System.out.println("Number after swapping first and last digits: " + swappedNum);
        sc.close();
    }
}
