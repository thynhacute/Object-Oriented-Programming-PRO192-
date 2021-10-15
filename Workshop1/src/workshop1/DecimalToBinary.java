
package workshop1;

import java.util.Scanner;


public class DecimalToBinary {
    public static void decimalToBinary() {
        Scanner decimal = new Scanner(System.in);
        System.out.println("Enter the decimal number :");
        int decimalString = decimal.nextInt();
        System.out.println("The binary number is: " + Integer.toBinaryString(decimalString));
    }
}