
package workshop1;

import java.util.Scanner;


public class CountNumber {
    public static void countNumber() {
        int number;
        int count = 0;
        Scanner countNumber = new Scanner(System.in);
        System.out.println("Input an Integer: ");
        number = countNumber.nextInt();
        for(; number != 0; number /= 10, ++count) { 
        }
        System.out.println("Number of digits: " + count);
    }
}
