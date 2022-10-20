
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cricket Format\n"+"1.ODI\n"+"2.T20\n"+"3.Test");
        int format =sc.nextInt();
        System.out.println("Enter the Current Score");
        int currentScore=sc.nextInt();
        System.out.println("Enter the Current over");
        float currentOver=sc.nextFloat();
        System.out.println("Enter the Target");
        int target=sc.nextInt();
        sc.close();
        if (format==1) {
            ODI match  = new ODI();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(target);
            match.display();
        }else if(format==2){
            T20 match  = new T20();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(target);
            match.display();
        }else if(format==3){
            Test match  = new Test();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(target);
            match.display();
        }else{
            System.out.println("Invalid Format type");
        }
    }
}
