import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println(num + " is not a power of 3.");
        } else {
            while (num % 3 == 0) {
                num = num / 3;
            }
            if (num == 1) {
                System.out.println("The given number is a power of 3.");
            } else {
                System.out.println("The given number is not a power of 3.");
            }
        }
        sc.close();
    }
}
