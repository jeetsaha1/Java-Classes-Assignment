package Week2;
//Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
import java.util.Scanner;
public class prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bin = sc.nextInt();
        int dec = 0, pow = 1;

        while (bin != 0) {
            dec += (bin % 10) * pow;
            pow *= 2;
            bin /= 10;
        }

        System.out.println("Decimal = " + dec);
    }
}
