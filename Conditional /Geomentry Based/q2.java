package Geometry;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        if (a*a == b*b + c*c ||
            b*b == a*a + c*c ||
            c*c == a*a + b*b) {
            System.out.println("The triangle is Right-Angled.");
        } else {
            System.out.println("The triangle is NOT Right-Angled.");
        }
        sc.close();
    }
}
