
package ws2;

import java.util.Scanner;

public class WS2Sentence3 {
    private String accountNumber;
    private String accountName;
    private long identityCardNumber;
    private String phoneNumber;
    private long accountBalance;

    public WS2Sentence3(String accountNumber, String accountName, long identityCardNumber, String phoneNumber, long accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(long identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Scanner getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Scanner withdraw) {
        this.withdraw = withdraw;
    }

    

    public void showbankCardInformation() {
        System.out.printf("|%-17s|%-17s|%-15s|%-15s|%-15s|\n", accountNumber, accountName, identityCardNumber, phoneNumber, accountBalance);
    }
    
    Scanner withdraw = new Scanner(System.in);

    public static void withDraw(WS2Sentence3 account) {
        Scanner withDraw = new Scanner(System.in);
        double amountWithdraw;
        System.out.println("Input the amount " + account.getAccountName() + " you want to withdraw: ");
        do {
            amountWithdraw = withDraw.nextDouble();
            if (amountWithdraw <= account.getAccountBalance()) {
                if (account.getAccountBalance() - amountWithdraw < 50000) {
                    System.out.println("Can not withdraw because the balance is less than 50000VND.");
                    System.out.println("Please input your Amount withdraw: ");
                } else {
                    account.setAccountBalance((long) (account.getAccountBalance() - amountWithdraw));
                    System.out.println("Successful Withdrawing!");
                    break;
                }
            } else {
                System.out.println("The balance is less than your number you input.");
                System.out.println("Please input your amount withdraw again: ");
            }
        } while(account.getAccountBalance() - amountWithdraw < 50000);
    }
}

