import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers from " + n + " to 1 are:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
