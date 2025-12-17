import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Perfect cube numbers between 1 and " + n + " are:");
        int i = 1;
        while (i * i * i <= n) {
            System.out.print((i * i * i) + " ");
            i++;
        }
    }
}
