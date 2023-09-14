//import java.lang.*;

class Marvellous implements Runnable {
    public void run() {
        System.out.println("Inside thread:" + Thread.currentThread().getName());
    }
}

class Mythread3 {
    public static void main(String a[]) {

        Marvellous mobj1 = new Marvellous();
        Thread t1 = new Thread(mobj1);

        Marvellous mobj2 = new Marvellous();
        Thread t2 = new Thread(mobj2, "SEcond");

        t1.start();
        t2.start();

    }

}
