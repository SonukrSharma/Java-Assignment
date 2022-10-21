package session6.question4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int noOfHalls=sc.nextInt();
        Hall[] hall = new Hall[noOfHalls];
        sc.nextLine();
        for (int i = 0; i < noOfHalls; i++) {
            String hallDetails=sc.nextLine();
            String[] st = hallDetails.split(",");
            String name=st[0];
            double costPerDay=Integer.parseInt(st[1]);
            String owner=st[2];
            hall[i]=new Hall(name, costPerDay, owner);
        }
        sc.close();
        System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");
        Arrays.sort(hall, (o1, o2) -> o1.getOwner().compareTo(o2.getOwner()));
        for (Hall h : hall) {
            System.out.format("%-15s %-10s %s\n",h.getName(),h.getCostPerDay(),h.getOwner());
        }
    }   
}
