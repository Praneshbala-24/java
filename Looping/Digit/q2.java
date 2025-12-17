import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num);   // handle negative numbers
        while (num >= 10) {
            num = num / 10;
        }
        if (num % 2 == 0) {
            System.out.println("First digit is Even.");
        } else {
            System.out.println("First digit is Odd.");
        }
        sc.close();
    }
}
