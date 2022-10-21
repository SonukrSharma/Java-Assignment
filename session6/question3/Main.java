package session6.question3;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int noOfUsers=sc.nextInt();
        System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        Address[] address=new Address[noOfUsers];
        sc.nextLine();
        for (int i = 0; i < noOfUsers; i++) {
            String userAddress = sc.nextLine();
            String[] st = userAddress.split(",");
            String username=st[0];
            String addressLine1=st[1];
            String addressLine2=st[2];
            int pinCode=Integer.parseInt(st[3]);
            address[i]=new Address(username, addressLine1, addressLine2, pinCode);
        }
        sc.close();
        Arrays.sort(address);
        System.out.println("User Details:");
        for (Address a : address) {
            System.out.println(a.getUsername()+","+a.getAddressLine1()+","+a.getAddressLine2()+","+a.getPinCode());
        }
    }   
}
