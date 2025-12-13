package charater;
import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is UPPERCASE.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is LOWERCASE.");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("The character is a DIGIT.");
        }
        else {
            System.out.println("The character is a SPECIAL SYMBOL.");
        }
    }
}

