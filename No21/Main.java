class Numbers {
    private int count=1;
    double getFact(){
        double fact= 1;
        count++;
        for (int i = 1; i <count ; i++) {
            fact *= i;
        }
        return 1/fact;
    }
}

class Printer extends Thread {
    public Numbers numbers;
    private int limit;
    public double sum;

    Printer(Numbers numbers, int limit) {
        this.numbers = numbers;
        this.limit = limit;
        this.sum = 0;
    }

    @Override
    public void run() {
        synchronized (numbers) {
            for (int i = 0; i < limit/2; i++)
                sum = sum + numbers.getFact();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int limit = 10;
        Numbers numbers = new Numbers();
        Printer even = new Printer(numbers,limit);
        Printer odd = new Printer(numbers,limit);
        even.start();
        odd.start();
        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result :" + (even.sum+ odd.sum) );
    }
}
