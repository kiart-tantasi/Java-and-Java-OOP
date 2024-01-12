public class MyRunnableThread implements Runnable {

    public Integer rounds;

    public MyRunnableThread(Integer rounds) {
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i <= rounds; i++) {
            System.out.println("Until " + rounds + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyRunnableThread runnableThread = new MyRunnableThread(5);
        MyRunnableThread runnableThreadTwo = new MyRunnableThread(3);
        Thread threadOne = new Thread(runnableThread);
        Thread threadTwo = new Thread(runnableThreadTwo);
        // thread.start();
        // threadTwo.start();

        System.out.println("Run one thread by one time\n");

        threadOne.start();
        // while (thread.isAlive()) {}
        try {
            threadOne.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("thread one is done.\n");

        threadTwo.start();
        // while (threadTwo.isAlive()) {}
        try {
            threadTwo.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("thread two is done.");
    }
}
