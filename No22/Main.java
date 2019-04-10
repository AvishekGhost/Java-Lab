import java.io.FileReader;

class Producer extends Thread {
    int[] arr;
    int size;

    Producer(int size) {
        arr = new int[size];
        this.size = size;
        start();
    }

    public synchronized void run() {
        try {
            int i, j = 0;
            FileReader fileReader = new FileReader("test.txt");
            do {
                i = fileReader.read();
                if (i != -1 && i != ' ') {
                    arr[j] = i - '0';
                    j++;
                }
            } while (i != -1);
        } catch (Exception e) {
        }
    }

    public int[] getArr() {
        return arr;
    }
}

class Consumer extends Thread {
    int sum = 0;
    int n;

    Consumer(int n) {
        this.n = n;
        start();
    }

    public synchronized void run() {
        try {
            Producer producer = new Producer(n);
            producer.join();

            for (int i = 0; i < producer.getArr().length; i++) {
                sum += producer.getArr()[i];
            }
        } catch (Exception e) {
        }
    }

    int getSum() {
        return sum;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "test.txt";
        int[] arr = new int[getFileSize(fileName)];
        Consumer consumer = new Consumer(getFileSize(fileName));
        consumer.join();
        System.out.println("Sum = " + consumer.getSum());

    }

    public static int getFileSize(String name) throws Exception {
        int i;
        int counter = 0;
        FileReader fileReader = new FileReader("test.txt");
        do {
            i = fileReader.read();
            if (i != -1 && i != ' ') {
                counter++;
            }
        } while (i != -1);
        return counter;
    }
}
