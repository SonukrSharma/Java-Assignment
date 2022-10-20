package question1;

public class ClientBO {
    public void viewDetails(Client[] clientList){
        for (int i = 0; i < clientList.length; i++) {
            System.out.println(clientList[i].toString());
        }
    }
    
    public void printClientDetailsWithCountry(Client[] clientList, String countryName){
        for (int i = 0; i < clientList.length ; i++) {
            if (clientList[i].getCountryName().equalsIgnoreCase(countryName)) {
                System.out.println(clientList[i].toString());
            }
        }
    }
}
