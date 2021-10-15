
package workshop1;

import java.util.Scanner;


public class BinaryToDecimal extends Workshop1 {
    public static int binaryToDecimal() {
        Scanner binary = new Scanner(System.in);
        long binaryNumber, remainder;
        long decimalNumber = 0;
        long j = 1;
        System.out.print("Input a Binary number: ");
        binaryNumber = binary.nextLong();
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("The Decimal number is: " + decimalNumber);
        return 0;
    }
}

