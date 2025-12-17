import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first alphabet: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter second alphabet: ");
        char ch2 = sc.next().charAt(0);
        if (ch1 < ch2) {
            for (char ch = (char)(ch1 + 1); ch < ch2; ch++) {
                System.out.print(ch + " ");
            }
        } else {
            for (char ch = (char)(ch2 + 1); ch < ch1; ch++) {
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}
