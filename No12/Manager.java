public class Manager {
    private Account []a;
    private int size;
    private int index = -1;

    Manager(int size){
        this.size = size;
        a = new Account[this.size];
    }

    void Add(Account src){
        this.index++;
        a[index] = src;
    }

    void Display(){
        System.out.println("AccNo\tName\tBalance\t\tInterest\tAcType");
        System.out.println("=====================================================================");
        for (int i = 0; i < index+1; i++) {
            System.out.println(a[i].accountNumber + "\t" + a[i].holderName + "\t" + a[i].balance + "\t" + a[i].YearlyInterest() + "\t" + a[i].type);
        }
    }


}
