public class SavingsAccount extends Account {
    private float interestRate = 6f;

    public SavingsAccount( String holderName, float balance) {
        super( holderName, balance, "Savings");
    }

    public float YearlyInterest(){
        return  ((interestRate/100) * balance);
    }
}
