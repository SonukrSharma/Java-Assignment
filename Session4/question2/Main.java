package Session4.question2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose Event type\n"+"1.Exhibition\n"+"2.StageEvent");
        try{
        int EventType=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the details in CSV format");
        String details=sc.nextLine();

        sc.close();
        
        StringTokenizer st = new StringTokenizer(details,",");
        String name= st.nextToken();
        String detail= st.nextToken();
        String type= st.nextToken();
        String organiserName= st.nextToken();

        if (EventType==1) {
            int noOfStalls= Integer.parseInt(st.nextToken());
            Exhibition event = new Exhibition(name,detail,type,organiserName,noOfStalls);
            System.out.println("Event:"+event.name);
            System.out.println("Detail:"+event.detail);
            System.out.println("Type:"+event.type);
            System.out.println("Organiser:"+event.organiserName);
            System.out.println("Number of Stalls:"+event.getNoOfStalls());
        }
        else if (EventType==1) {
            int noOfSeats= Integer.parseInt(st.nextToken());
            StageEvent event = new StageEvent(name,detail,type,organiserName,noOfSeats);
            System.out.println("Event Name:"+event.name);
            System.out.println("Detail:"+event.detail);
            System.out.println("Type:"+event.type);
            System.out.println("Organiser:"+event.organiserName);
            System.out.println("Number of Stalls:"+event.getNoOfSeats());
        }else{
            System.out.println("Invalid choice");
        }
    }catch(Exception e){
        System.out.println("Error due to: "+ e);
    }
        
    }
}
