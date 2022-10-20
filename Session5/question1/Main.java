package question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of clients");
        int n=sc.nextInt();
        Client[] clientList = new Client[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter client "+(i+1)+" details:");
            System.out.println("Enter the client id");
            int clientId=sc.nextInt();
            System.out.println("Enter the client name");
            sc.nextLine();
            String clientName=sc.nextLine();
            System.out.println("Enter the client phone number");
            String phoneNumber=sc.nextLine();
            System.out.println("Enter the client email id");
            String email=sc.nextLine();
            System.out.println("Enter the client passport number");
            String passport=sc.nextLine();
            System.out.println("Enter the client iata country code");
            String iataCountryCode=sc.nextLine();
            System.out.println("Enter the client country name");
            String countryName=sc.nextLine();

            Country country=new Country(iataCountryCode,countryName);
            clientList[i]=new Client(clientId, clientName, phoneNumber, email, passport, country);    
        }
        
        ClientBO clientBO= new ClientBO();
        
        while(true){
        System.out.println("Menu:\n"+"1.View client details\n"+"2.Filter client with country\n"+"3.Exit");
        System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s\n", "ClientId","ClientName","PhoneNumber","Email","Passport","IATACountryCode","CountryName");
        int choice=sc.nextInt();
        if (choice==1) {
            clientBO.viewDetails(clientList);
        }
        else if (choice==2) {
            sc.nextLine();
            String countryName=sc.nextLine();
            clientBO.printClientDetailsWithCountry(clientList, countryName);
        }
        else if (choice==3) {
            break;
        }
        else{
            System.out.println("Invalid Choice");
        }
            
        }
        sc.close();
    }
}
