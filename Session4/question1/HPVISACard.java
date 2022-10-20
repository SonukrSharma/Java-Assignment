package Session4.question1;

public class HPVISACard extends VISACard{
    
    HPVISACard(String holderName, String ccv) {
        super(holderName, ccv);
    }

    public Double computeRewardPoints(String purchaseType, Double amount){
        double rewardPoints=0.0;
        if (purchaseType.equalsIgnoreCase("Fuel")) {
            rewardPoints=amount*(0.01)+(10.0);
        }
        return rewardPoints;
    }
}
