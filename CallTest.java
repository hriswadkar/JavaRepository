
class CallTest {
	synchronized void callMe(String msg) {
		System.out.println("[" + msg);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			System.out.println("Thread is interrupted");
		}
		System.out.println("]");
	}
}

class Call implements Runnable {
	String msg;
	CallTest ob1;
	Thread t;
	
	public Call(CallTest t1, String s) {
		System.out.println("Inside caller method");
		
		ob1=t1;
		msg=s;
		
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		ob1.callMe(msg);
	}
}

class SynchTest {
	public static void main(String[] args) {
		
	}
}