
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
		CallTest t = new CallTest();
		Call obj1 = new Call(t,"Hi");
		Call obj2 = new Call(t, "this");
		Call obj3 = new Call(t, "is");
		Call obj4 = new Call(t, "synchronization");
		Call obj5 = new Call(t, "testing");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
			obj4.t.join();
			obj5.t.join();
		} catch(InterruptedException ex) {
			System.out.println("Thread interrupted");
		}
	}
}