 class ChildThread implements Runnable{
    {
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println("In Child Thread");
    }
}

class MainThread implements Runnable{
    {
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println("In Main Thread");
    }
}

public class Main {
    public static void main(String[] args) {
        MainThread m = new MainThread();
        ChildThread c = new ChildThread();
    }
}
