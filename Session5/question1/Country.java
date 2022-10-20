package question1;

public class Country {
    private String iataCountryCode;
    private String countryName;
    
    Country(){}

    Country(String iataCountryCode,String countryName){
        this.iataCountryCode=iataCountryCode;
        this.countryName=countryName;
    }

    public String getIataCountryCode() {
        return iataCountryCode;
    }
    
    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }
    
    public String getCountryName() {
        return countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    @Override
    public String toString(){
        return String.format("%-25s %s\n",iataCountryCode,countryName);
    }
}
