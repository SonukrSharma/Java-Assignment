import java.util.Scanner;
public class s3q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Address 1:");
        String address1=sc.nextLine();
        System.out.println("Enter Address 2:");
        String address2=sc.nextLine();
        sc.close();
        try{
           
        if(address1.equals(address2)){
            System.out.println("RED");
        }else if(address1.equalsIgnoreCase(address2)){
            System.out.println("BLUE");
        }else if(!address1.equals(address2) && address1.replaceAll("\\s+", "").equals(address2.replaceAll("\\s+", ""))){
            System.out.println("YELLOW");
        }else{
            System.out.println("RED");
        } 
        }catch(Exception e){
            System.out.println("Error Due to: "+ e);
        }    
    }
}
