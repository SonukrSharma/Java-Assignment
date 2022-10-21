package session6.question3;

public class Address implements Comparable<Address> {

    private String username;
    private String addressLine1;
    private String addressLine2;
    private int pinCode;
    
    Address(){}

    Address(String username, String addressLine1, String addressLine2, Integer pinCode){
        this.username=username;
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.pinCode=pinCode;
    }

    @Override
    public int compareTo( Address o) {
        if(o.getPinCode()==this.getPinCode()){
            return o.getAddressLine1().compareTo(this.getAddressLine1());
        }
        return this.pinCode - o.pinCode;
    }
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

}
