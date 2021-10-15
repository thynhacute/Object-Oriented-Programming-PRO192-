
package practiceexam;

import data.Cabinet;
import ui.Menu;

/**
 *
 * @author NhaThy
 */

public class PracticeExam {

    public static void main(String[] args) {
        Menu menu = new Menu("Shoes System");
        menu.addNewOption("|-----------------WELCOME TO SHOES CABINET OF NHATHY--------------------|");
        menu.addNewOption("|  1.Add a pair of shoes to the list                                    |");
        menu.addNewOption("|  2.Search a pair of Shoes by Code                                     |");
        menu.addNewOption("|  3.Print the shoes list in the descending order of Price              |");
        menu.addNewOption("|  4.Print the shoes list in the ascending order of Model/Name          |");
        menu.addNewOption("|  5.Print the shoes list in the ascending order of Code                |");
        menu.addNewOption("|  4.Quit                                                               |");
        menu.addNewOption("|-----------------------------------------------------------------------|");
        
        Cabinet shoesCabinet = new Cabinet();

        int choice;
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1: {
                    System.out.println("You are preparing to input a new"
                            + "Shoes profile");
                    shoesCabinet.addNewShoes();
                    break;
                }
                case 2: {
                    System.out.println("You are preparing to input"
                            + "a code Shoes to search");
                    shoesCabinet.searchShoesByCode();
                    break;
                }
                case 3: {
                    System.out.println("You are preparing to"
                            + "print the shoes list descending order of Price");
                    shoesCabinet.printShoesListDescendingByPrice();
                    break;
                }
                case 4: {
                    System.out.println("You are preparing to"
                            + "print the Shoes list ascending by name");
                    shoesCabinet.printShoesListAscendingByName();
                    break;
                }
                case 5: {
                    System.out.println("You are preparing to"
                            + "print the Shoes list ascending by id");
                    shoesCabinet.printShoesListAscendingByCode();
                    break;
                }
                case 6: {
                    System.out.println("Bye bye!!!");
                    break;
                }
            }
        }while(choice != 6);
    }
}