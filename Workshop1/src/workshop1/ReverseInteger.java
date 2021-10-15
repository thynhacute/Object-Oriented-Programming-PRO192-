
package workshop1;

import java.util.Scanner;


public class ReverseInteger {
    public static void reverseInteger() {
        int number;
        int reversed = 0;
        Scanner reverseNumber = new Scanner(System.in);
        System.out.println("Input an Integer: ");
        number = reverseNumber.nextInt();
        for(; number != 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
