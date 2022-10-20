package Session4.question1;

public class VISACard {
    private String holderName;
    private String ccv;
    
    VISACard(String holderName,String ccv){
        this.holderName=holderName;
        this.ccv=ccv;
    }
    public void setHolderName(String holderName) {
        this.holderName=holderName;
    }
    public String getHolderName() {
        return this.holderName;
    }
    public void setCCV(String ccv) {
        this.ccv=ccv;
    }
    public String getCCV() {
        return this.ccv;
    }


    public Double computeRewardPoints(String purchaseType, Double amount){
        double rewardPoints=0.0;
        rewardPoints=amount*(0.01);
        return rewardPoints;     
    }
}


