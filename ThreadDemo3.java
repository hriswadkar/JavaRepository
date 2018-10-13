class MyThreadDemo extends Thread {
	public String msg[] = {
		"java","is","very","good","programming","language"
	};
	
	MyThreadDemo(String s) {
		super();
	}
	
	public void run() {
		String name = getName();
		for(int i=0;i<msg.length;i++) {
			Wait();
			System.out.println(name + ": " + msg[i]);
		}
	}
	
	void Wait() {
		try {
			sleep(1000);
		} catch(InterruptedException ex) {
			System.out.println("Thread interrupted");
		}
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		MyThreadDemo td1 = new MyThreadDemo("Thread 1");
		MyThreadDemo td2 = new MyThreadDemo("Thread 2");
		
		td1.start();
		td2.start();
		
		boolean isAlive1 = true;
		boolean isAlive2 = true;
		
		do {
			if(isAlive1 && !td1.isAlive()) {
				isAlive1 = false;
				System.out.println("Thread 1 is dead");
			}
			
			if(isAlive2 && !td2.isAlive()) {
				isAlive2 = false;
				System.out.println("Thread 2 is dead");
			}			
		} while(isAlive1 || isAlive2);
	}
}