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
			wait();
			System.out.println(name + ": " + msg[i]);
		}
	}
	
	void wait() {
		try {
			sleep(1000);
		} catch(InterruptedException ex) {
			System.out.println("Thread interrupted");
		}
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		
	}
}