class Adder extends Thread{
    int i=0;
    int n;
    double sum =0;
    Adder(int n){
        this.n = n;
    }
    public synchronized void run(){
        while (true){
            if(i==10) break;
            i++;
            NumGen numGen = new NumGen(i);
            numGen.start();
            try {
                numGen.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            add(numGen.getFact());
        }
    }

    void add(int fact){
        sum +=(double) 1/fact;
    }

    void get(){
        System.out.println("sum = " + sum);
    }
}

class NumGen extends Thread{
    int fact = 1;
    int i;
    NumGen(int i){
        this.i = i;
    }
    public synchronized void run(){
        while (i>0) {
            fact *= i;
            i--;
        }
    }

    public int getFact() {
        return fact;
    }
}


public class Main{
    public static void main(String[] args) throws Exception {
        int n = 10;
        Adder adder = new Adder(n);
        adder.start();
        adder.join();
        adder.get();
    }
}
