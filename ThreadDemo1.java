public class ThreadDemo1 {
	public static int counter;
	public ThreadDemo1() {
		counter++;
		System.out.println("Counter is: " + counter);
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		t.setName("MyThread");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		
		int i;
		
		for(i=1;i<20;i++) {
			System.out.println("i: " + i);
			Thread.sleep(500);
		}
		
		System.out.println("is Thread alive: " + t.isAlive());
		System.out.println("is Thread daemon: " + t.isDaemon());
		
		
		Thread t1 = new Thread("ThreadDemo1");
		t1.start();
		
		//SampleThread sample = new SampleThread();
		
		//Thread t2 = new Thread("SampleThread");
		//t2.start();
		
	}
}

class SampleThread implements Runnable {
	public static int counter;
	
	public SampleThread() {
		counter++;
		System.out.println("Counter is: " + counter);
		
	}
	public void run() {
		new SampleThread();
	}
}