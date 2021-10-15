package workshop1;

import java.util.Scanner;
import static workshop1.BinaryToDecimal.binaryToDecimal;
import static workshop1.CountNumber.countNumber;
import static workshop1.DecimalToBinary.decimalToBinary;
import static workshop1.MultiplicationTable.multiplicationTable;
import static workshop1.ReverseInteger.reverseInteger;

public class Workshop1 {

    public static void main(String[] args) {
        int choiceentry;
        Scanner scanchoice = new Scanner(System.in);
        for (;;) {
            System.out.println("|--------------------------------MENU--------------------------------|");
            System.out.println("| Enter one of the following commands:                               |");
            System.out.println("| 1 - Convert binary number to decimal.                              |");
            System.out.println("| 2 - Convert decimal number to binary.                              |");
            System.out.println("| 3 - Create Multiplication Table from 1 to 9.                       |");
            System.out.println("| 4 - Count Number of Digits in an Integer. Example: 678 -> 3        |");
            System.out.println("| 5 - Reverse an Integer. Example: 1234 -> 4321.                     |");
            System.out.println("| 6 - EXIT.                                                          |");
            System.out.println("|--------------------------------------------------------------------|");
            System.out.println();
            do {
                System.out.println("Please enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\"");
                choiceentry = scanchoice.nextInt();
                if ((choiceentry < 1) || (choiceentry > 6))
                    System.out.println("False input!\nPlease input your choice again.");
            }while ((choiceentry < 1) || (choiceentry > 6));
            switch (choiceentry) {
                case 1: {
                    binaryToDecimal();
                    break;
                }
                case 2: {
                    decimalToBinary();
                    break;
                }
                case 3: {
                    multiplicationTable();
                    break;
                }
                case 4: {
                    countNumber();
                    break;
                }
                case 5: {
                    reverseInteger();
                    break;
                }
                case 6:
                    System.out.println("THANK YOU!\nSEE YOU LATER!");
                    System.exit(0);
                    break;
            }
        }
    }
}
