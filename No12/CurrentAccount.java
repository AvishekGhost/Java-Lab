public class CurrentAccount extends Account {
    private float interestRate = 4f;

    public CurrentAccount(String holderName, float balance) {
        super( holderName, balance, "Current");
    }

    public float YearlyInterest(){
        return ((interestRate/100) * balance);
    }
}
