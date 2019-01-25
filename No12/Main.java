public class Main {
    public static void main(String[] args) {
        CurrentAccount []currentAccount = new CurrentAccount[3];
        SavingsAccount []savingsAccount = new SavingsAccount[2];
        Manager manager = new Manager(6);

        for (int i = 0; i < 3; i++) {
            currentAccount[i] = new CurrentAccount(RandomString(), (float)(Math.random()*10000));
            manager.Add(currentAccount[i]);
        }
        for (int i = 0; i < 2; i++) {
            savingsAccount[i] = new SavingsAccount(RandomString(), (float)(Math.random()*10000));
            manager.Add(savingsAccount[i]);
        }
        manager.Display();
    }

    protected static String RandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        while (salt.length() < 5) {
            int index = (int) ((float)Math.random() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
