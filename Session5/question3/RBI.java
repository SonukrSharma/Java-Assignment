package question3;

public class RBI implements Bank {

    private String accountNumber;
    private double creditScore;
    private String holderName;
    private int amount;
    private final double CREDIT =0.1;

    @Override
    public double calculateCreditSCore() {
        return CREDIT*amount+getCreditScore();
    }
    void display(){
        System.out.println("Hi,"+getHolderName()+"\nYou have gained "+String.format("%.2f",(CREDIT*amount))+" credit score for the payment of "+getAmount()+"\nYour Total Credit Score is "+String.format("%.2f",(calculateCreditSCore())));
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getCREDIT(){
        return CREDIT;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

}
