class Numbers {
    private int count=0;
    int getIncrement(){
        count++;
        return count;
    }
}

class Printer extends Thread {
    public Numbers numbers;

    Printer(Numbers numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        synchronized (numbers) {
            for (int i = 0; i < 5; i++)
                System.out.println(numbers.getIncrement());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Thread even = new Printer(numbers);
        Thread odd = new Printer(numbers);
        even.start();
        odd.start();
    }
}
