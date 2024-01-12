public class MyThread extends Thread {

    public Integer threadNumber;
    public Integer rounds;

    public MyThread(Integer threadNumber, Integer rounds) {
        this.threadNumber = threadNumber;
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i <= rounds; i++) {
            System.out.println("Thread No." + this.threadNumber + ": " + i);

            // make it slower (500 milli for each loop)
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {

        // Thread
        // MyThread myThread = new MyThread(1,7);
        // MyThread myThreadTwo = new MyThread(2,8);
        // myThread.start();
        // myThread.join();
        // System.out.println("\n");
        // myThreadTwo.start();
        // myThreadTwo.join();
        // System.out.println("\n");

        // new Thread(myThread)
        // Thread threadTest = new Thread(myThread);
        // threadTest.start();
        // threadTest.join();

        MyThread threadOne = new MyThread(1, 4);
        MyThread threadTwo = new MyThread(2, 3);

        // THREAD 1
        threadOne.start();
        // while (threadToFive.isAlive()) { }
        try {
            threadOne.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("FIRST THREAD DONE\n");

        // THREAD 2
        threadTwo.start();
        // while (threadToThree.isAlive()) { }
        try {
            threadTwo.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("SECOND THREAD DONE");

    }
}
