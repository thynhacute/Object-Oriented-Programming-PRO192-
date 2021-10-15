package runtime;

import java.util.Scanner;
import ws3.Disk;
import static ws3.Disk.informationDisk;
import static ws3.Rectangle.informationRectangle;
import static ws3.Square.informationSquare;

public class BeNa {

    public static void main(String[] args) {
        int choiceentry;
        Scanner sc = new Scanner(System.in);
        System.out.println("|-------------------WELCOME TO SHAPE OF BENA------------------|");
        System.out.println("| Enter the shape you want BeNa to crop:                      |");
        System.out.println("| 1 - Disk                                                    |");
        System.out.println("| 2 - Rectangle                                               |");
        System.out.println("| 3 - Square                                                  |");
        System.out.println("| 4 - EXIT - You don't want it. BeNa will be sad :<<          |");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println();
        while (true) {
            try {

                System.out.println("Please enter 1, 2, 3 or 4");
                choiceentry = Integer.parseInt(sc.nextLine());
                if (choiceentry < 1 || choiceentry > 4) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("False input!\nPlease input your choice again.");
            }
        }
        switch (choiceentry) {
            case 1: {
                informationDisk();
                break;
            }
            case 2: {
                informationRectangle();
                break;
            }
            case 3: {
                informationSquare();
                break;
            }
            case 4: {
                System.out.println("THANK YOU!\nSEE YOU LATER!");
                System.exit(0);
                break;
            }
        }
    }
}
