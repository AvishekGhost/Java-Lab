public  class Account {
    protected int accountNumber;
    protected static int accountHolders;
    protected String holderName;
    protected float balance;
    protected String type;

    static {
        accountHolders = 1000;
    }

    public Account( String holderName, float balance, String  type) {
        this.accountNumber = accountHolders;
        this.accountHolders++;
        this.holderName = holderName;
        this.balance = balance;
        this.type = type;
    }

    public float YearlyInterest(){
        return 0;
    }
}
