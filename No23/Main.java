
class EvenSeries implements Runnable{
    int sum;
    int n;
    {
        sum = 0;
        n = 100;
    }
    @Override
    public void run() {
        for (int i = 2; i <= n; i += 2) {
            sum = sum + i;
        }
    }
    int getSum(){ return  sum;}
}
class OddSeries implements Runnable{
    int sum;
    int n;
    {
        sum = 0;
        n = 99;
    }
    @Override
    public void run() {
        for (int i = 1; i <= n; i+=2) {
            sum = sum + i;
        }
    }
    int getSum(){ return  sum;}
}

public class Main{
    public static void main(String[] args) throws Exception {
        OddSeries oddSeries = new OddSeries();
        EvenSeries evenSeries = new EvenSeries();
        Thread t1 = new Thread(oddSeries);
        Thread t2 = new Thread(evenSeries);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Sum :: " + (oddSeries.getSum() + evenSeries.getSum()));
    }
}

