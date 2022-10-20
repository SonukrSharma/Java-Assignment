package Session4.question1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the holder name");
        String holdername=sc.nextLine();
        System.out.println("Enter the CCV number");
        String ccv=sc.nextLine();
        System.out.println("Enter the bill amount");
        double amount=sc.nextDouble();
        sc.nextLine();
        System.out.println("Mention the type of spending");
        String purchaseType=sc.nextLine();
        System.out.println("Choose card type\n"+"1.VISA card\n"+"2.HP VISA card");
        int cardType=sc.nextInt();
      
        
        if(cardType==1){
            VISACard card = new VISACard(holdername, ccv);
            System.out.println("Holder name:"+card.getHolderName());
            System.out.println("CCV:"+card.getCCV());
            System.out.println("Reward points:"+card.computeRewardPoints(purchaseType,amount));
        }else if(cardType==2){
            HPVISACard card = new HPVISACard(holdername, ccv);
            System.out.println("Holder name:"+card.getHolderName());
            System.out.println("CCV:"+card.getCCV());
            System.out.println("Reward points:"+card.computeRewardPoints(purchaseType, amount));    
        }else{
            System.out.println("Invalid Input");
        }
        System.out.println("Do you want to continue?(Y/N)");
        String userWish=sc.next();
        if (userWish.equals("N") || userWish.equals("n")) {
            break;
        }
        sc.nextLine();
        }
        sc.close();
    }
}
