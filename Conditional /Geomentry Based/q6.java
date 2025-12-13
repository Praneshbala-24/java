package Geometry;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();
        System.out.print("Enter side 4: ");
        int d = sc.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("The sides form a SQUARE.");
        }
        else if (a == c && b == d) {
            System.out.println("The sides form a RECTANGLE.");
        }
        else {
            System.out.println("The sides do NOT form a square or rectangle.");
        }
        sc.close();
    }
}
