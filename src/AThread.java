public class AThread implements Runnable {

    public void run() {
    }

    public static void main(String[] args) {
        Runnable run = new AThread();

        Thread t1 = new Thread(new Combat());

        t1.start();
    }
}
