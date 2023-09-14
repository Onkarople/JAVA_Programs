//import java.lang.*;

class Demo extends Thread {
    public void run() // running state
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException obj) {

            }
        }

    }
}

class Mythread5 {
    public static void main(String a[]) throws Exception {
        Demo obj1 = new Demo();
        Thread t1 = new Thread(obj1, "First");// new state

        Demo obj2 = new Demo();
        Thread t2 = new Thread(obj2, "Second");

        t1.start(); // runnable state

        t1.join();

        t2.start();

        // Dead state.

    }

}
