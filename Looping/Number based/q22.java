import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num > 9) {   
            int sum = 0;
            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }
            num = sum;
        }
        if (num == 1) {
            System.out.println("The given number is a Magic Number.");
        } else {
            System.out.println("The given number is not a Magic Number.");
        }
        sc.close();
    }
}
