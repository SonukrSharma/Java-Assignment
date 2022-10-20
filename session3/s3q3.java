import java.util.Scanner;
public class s3q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        try{
        String string=sc.nextLine();
        sc.close();
        System.out.println("The processed string is "+string.replaceAll("\\s+", " "));
        }catch(Exception e){
            System.out.println("Error due to: "+ e);
        }
    }
}
