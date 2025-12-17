import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        long num = sc.nextLong();
        int count0 = 0, count1 = 0;
        while (num > 0) {
            long digit = num % 10;
            if (digit == 0) {
                count0++;
            } else if (digit == 1) {
                count1++;
            }
            num = num / 10;
        }
        System.out.println("Number of 0s = " + count0);
        System.out.println("Number of 1s = " + count1);
        sc.close();
    }
}
