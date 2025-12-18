import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.next();
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + binaryString);
        System.out.println("Decimal: " + decimal);
    }
}
