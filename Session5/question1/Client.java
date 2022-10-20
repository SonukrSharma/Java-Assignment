package question1;

public class Client{
    private int clientId;
    private String clientName;
    private String phoneNumber;
    private String email;
    private String passport;
    private Country country = new Country();

    Client(){}
    
    public Client(int clientId,String clientName,String phoneNumber,String email,String passport,Country country) {
        this.clientId=clientId;
        this.clientName=clientName;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.passport=passport;
        this.country=country;

    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getCountryName() {
        return country.getCountryName();
    }
    public String getIataCountryCode() {
        return country.getIataCountryCode();
    }

    @Override
    public String toString(){
        return String.format("%-25s %-25s %-25s %-25s %-25s %s",clientId, clientName,email,phoneNumber,passport,country.toString());
    }


}
