package session6.question1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Events:");
        int noOfEvents = sc.nextInt();
        sc.nextLine();
        if(noOfEvents<1){
            System.out.println("Invalid Input");
            return;
        }
        ArrayList<Event> eventList = new ArrayList<Event>();
        System.out.println("Enter event details in CSV(Event Name,Maximum Tickets,Event OwnerName)");
        for(int i=0 ; i<noOfEvents; i++){
            String eventDetails = sc.nextLine();
            String[] st = eventDetails.split(",");
            String eventName=st[0];
            int maxTickets=Integer.parseInt(st[1]);
            String ownerName=st[2];
            Event event = new Event(eventName, maxTickets, ownerName);
            eventList.add(event);
        }
        
        System.out.println("Enter owner name:");
        String ownerName = sc.nextLine();
        int frequency = Collections.frequency(eventList, new Event(null,0,ownerName));
        System.out.println(ownerName+" has been organising : "+frequency+" events");
        sc.close();
    }
}
