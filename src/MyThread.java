public class MyThread extends Thread {

    public Integer rounds;

    public MyThread(Integer rounds) {
        this.rounds = rounds;
    }

    public void run() {
        for (int i = 0; i <= rounds; i++) {
            System.out.println("Until " + rounds + ": " + i);
        }
    }

    public static void main(String[] args) {

        // Thread
//        MyThread myThread = new MyThread(7);
//        MyThread myThreadTwo = new MyThread(8);
////        Thread threadTest = new Thread(myThread);
////        threadTest.start();
//        myThread.start();
//        myThreadTwo.start();

        // isAlive
        MyThread threadToFive = new MyThread(5);
        MyThread threadToThree = new MyThread(3);
        threadToFive.start();
        while (threadToFive.isAlive()) {}
        System.out.println("FIRST THREAD DONE");
        threadToThree.start();
        while (threadToThree.isAlive()) {}
        System.out.println("ALL THREADS DONE !");
    }
}
