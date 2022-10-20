import java.util.Scanner;
import java.util.StringTokenizer;
public class s3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n=sc.nextInt();
        System.out.println("Enter user address details in CSV format(User ID,Street,City,State):");
        sc.nextLine();
        String[] userAddressDetails=new String[n];
        for (int i = 0; i < n; i++) {
            userAddressDetails[i]=sc.nextLine();
        }
        sc.close();
        try {
            System.out.format("%-15s %-15s %-15s %s\n", "User ID","Street","City","State");
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(userAddressDetails[i],","); 
                String userID=st.nextToken();  
                String street=st.nextToken();  
                String city=st.nextToken();  
                String state=st.nextToken();  
                System.out.format("%-15s %-15s %-15s %s\n", userID,street,city,state);    
            }
        } catch (Exception e) {
            System.out.println("Error due to: " + e);
        }

    }
}
