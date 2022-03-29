public class MyRunnableThread implements Runnable {

    public Integer rounds;

    public MyRunnableThread(Integer rounds) {
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i <= rounds; i++) {
            System.out.println("Until " + rounds + ": " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnableThread runnableThread = new MyRunnableThread(5);
        MyRunnableThread runnableThreadTwo = new MyRunnableThread(3);
        Thread thread = new Thread(runnableThread);
        Thread threadTwo = new Thread(runnableThreadTwo);
//        thread.start();
//        threadTwo.start();

        System.out.println("Run one thread by one time\n");

        thread.start();
        while (thread.isAlive()) {}
        System.out.println("thread one is done.\n");
        threadTwo.start();
        while (threadTwo.isAlive()) {}
        System.out.println("thread two is done.");
    }
}
