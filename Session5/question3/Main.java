package question3;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Bank Name\n1.ICICI\n2.HDFC");
        int choice=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Holder Name");
        String holderName=sc.nextLine();
        System.out.println("Enter the Account Number");
        String accountNumber=sc.nextLine();
        System.out.println("Enter the Previous Credit Score");
        double creditScore=sc.nextDouble();
        System.out.println("Enter the Amount to be Paid");
        int amount=sc.nextInt();
        sc.close();
        System.out.println("Amount Paid Successfully!!!");
        if (choice==1) {
            ICICI bank = new ICICI();
            bank.setHolderName(holderName);
            bank.setAccountNumber(accountNumber);
            bank.setCreditScore(creditScore);
            bank.setAmount(amount);
            bank.display();
        }else if (choice==2) {
            HDFC bank = new HDFC();
            bank.setHolderName(holderName);
            bank.setAccountNumber(accountNumber);
            bank.setCreditScore(creditScore);
            bank.setAmount(amount);
            bank.display();
        }else{
            System.out.println("Invalid Bank Type");
        }

    }
}
