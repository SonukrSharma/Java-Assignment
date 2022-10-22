package session6.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bookings:");
        int noOfBookings=sc.nextInt();
        sc.nextLine();
        ArrayList<PriceAndBookingTimeComparator> tickets=new ArrayList<PriceAndBookingTimeComparator>();
        for (int i = 0; i < noOfBookings; i++) {
            System.out.println("Enter the details of booking "+(i+1));
            String bookingDetails=sc.nextLine();
            String[] st = bookingDetails.split(",");
            String stageEventShow=st[0];
            try {
                Date bookingTime=new SimpleDateFormat("dd-mm-yyyy").parse(st[1]);
                String seatNumber=st[2];
                double price = Double.parseDouble(st[3]);
                TicketBooking ticketBooking = new TicketBooking(stageEventShow, bookingTime, seatNumber, price);
                PriceAndBookingTimeComparator priceAndBookingTimeComparator = new PriceAndBookingTimeComparator(ticketBooking);
                tickets.add(priceAndBookingTimeComparator);
            } catch (Exception e) {
                System.out.println("Error due to :"+e);;
            }

        }
        sc.close();
        System.out.println("Sorted Order:");
        System.out.format("%-15s%-15s%-15s%-15s","Event name"," Booking Time"," Seat number"," Price");
        Collections.sort(tickets);
        for (PriceAndBookingTimeComparator ticket: tickets) {
            System.out.println(ticket);
        }
    }
}
