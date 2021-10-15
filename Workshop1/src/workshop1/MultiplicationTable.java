
package workshop1;

import java.util.Scanner;


public class MultiplicationTable {
    public static void multiplicationTable() {
        Scanner multiplicationTable = new Scanner(System.in);
        System.out.println("Input your number: ");
        int i = multiplicationTable.nextInt();
        int number = 1;
        while(number <= 10) {
            System.out.println(i + " * " + number + " = " + (number * i));
            number++;
        }
    }
}
