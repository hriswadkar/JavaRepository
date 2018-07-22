
class MyThread implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch(Exception ex) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread t1 = new Thread(thread1);
        //t1.setPriority(6);
        t1.start();

        Thread current = Thread.currentThread();

        System.out.println("Main thread priority: " + current.getPriority());
        System.out.println("Secondary thread priority: " + t1.getPriority());
    }
}