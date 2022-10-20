package question3;

public class HDFC extends RBI {
    @Override
    public double calculateCreditSCore() {
        return getCREDIT()*getAmount();
    }
    void display(){
        System.out.println("Hi,"+getHolderName()+"\nYou have gained "+calculateCreditSCore()+" credit score for the payment of "+getAmount()+"\nYour Total Credit Score is"+getCreditScore());
    }
}
