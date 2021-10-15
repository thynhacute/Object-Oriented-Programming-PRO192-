
package runtime;

import java.util.Scanner;
import ws2.WS2Sentence1;
import ws2.WS2Sentence1V2;
import ws2.WS2Sentence2;
import ws2.WS2Sentence3;
import static ws2.WS2Sentence3.withDraw;


public class Program {
    public static void main(String[] args) {
        
        System.out.println("Sentence 1: Information list of watches.");
        WS2Sentence1 clock1 = new WS2Sentence1("Atlantic", "Men's watch", "Leather cord", 
                "Sapphire", "Stainless Steel", "Quartz", "5ATM", "42mm", "10 years", 
                "Switzerland", "0986.681.189", "Receive directly", "AT-68750.41.25R", 
                "20.862.000VND");
        clock1.showInfor();
        
        WS2Sentence1 clock2 = new WS2Sentence1("Atlantic", "Men's watch", "Leather cord", 
                "Sapphire", "Stainless Steel", "Quartz", "5ATM", "42mm", "10 years", 
                "Switzerland", "0986.681.189", "Receive directly", "AT-68450.41.52R", 
                "12.587.500VND");
        clock2.showInfor();
        
        WS2Sentence1V2 clock3 = new WS2Sentence1V2("Casio", "Women's watch", "Mineral Crystal", 
                "Quartz", "5ATM", "44.5mm x 39.3mm", "1 year", "Japan", "SHE-3806SPG-7AUDR", 
                "4.646.000VND");
        clock3.showInforV2();
        
        System.out.println("\nSentence 2: Information of books on Amazon.");
        WS2Sentence2 book1 = new WS2Sentence2("A Knock at Midnight", "Hope, Justice, and Freedom", 
                "Brittany K. Barnett", "English", "September 8, 2020", "336 pages", 
                "198482578X", "16.39$", "4.7 on 5");
        book1.showInforBooks();
        
        WS2Sentence2 book2 = new WS2Sentence2("Migrations", "A Novel Hardcover", 
                "Charlotte McConaghy", "English", "August 4, 2020", "272 pages", 
                "125020402X", "13.49$", "4.5 on 5");
        book2.showInforBooks();
        
        WS2Sentence2 book3 = new WS2Sentence2("Hidden Valley Road", 
                "Inside the Mind of an American Family", "Robert Kolker", "English", 
                "in 2020", "370 pages", "B07TZYFR71", "12.99$", "4.6 on 5");
        book3.showInforBooks();
        
        System.out.println("\nSentence 3: Information of bank's account.");
        WS2Sentence3 account1 = new WS2Sentence3("03064405002", "HOANG NHA THY", 272847426L, "0819439460", 70_000_000);
        account1.showbankCardInformation();
        
        WS2Sentence3 account2 = new WS2Sentence3("03365780501", "PHAM QUANG LINH", 245386193L, "0962448707", 100_000_000);
        account2.showbankCardInformation();
        
        WS2Sentence3 account3 = new WS2Sentence3("03332901601", "HUYNH TAI SANG", 123456789L, "0834491515", 200_000_000);
        account3.showbankCardInformation();
        
        WS2Sentence3 account4 = new WS2Sentence3("03064488302", "LE THI MY CAM", 234567890L, "0898874010", 50_000_000);
        account4.showbankCardInformation();
        
        WS2Sentence3 account5 = new WS2Sentence3("03064466789", "MAN NHI", 135792468L, "0987400704", 50_000_000);
        account5.showbankCardInformation();
        
            int choiceentry;
            Scanner scanchoice = new Scanner(System.in);
            for (;;) {
                do {
                    System.out.println("Please input your account you want to withdraw: ");
                    choiceentry = scanchoice.nextInt();
                    if ((choiceentry < 1) || (choiceentry > 6))
                        System.out.println("False input!\nPlease input your choice again.");
                } while ((choiceentry < 1) || (choiceentry > 6));
                switch (choiceentry) {
                    case 1: {
                        System.out.println("You choose account 1.");
                        withDraw(account1);
                    }
                    case 2: {
                        System.out.println("You choose account 2.");
                        withDraw(account2);
                    }
                    case 3: {
                        System.out.println("You choose account 3.");
                        withDraw(account3);
                    }
                    case 4: {
                        System.out.println("You choose account 4.");
                        withDraw(account4);
                    }
                    case 5: {
                        System.out.println("You choose account 5.");
                        withDraw(account5);
                    }
                }
            }
    }
}
        
     
        
        
        
    
    

