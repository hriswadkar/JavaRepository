public class ConstructorDemo {
	public static void main(String[] args) {
		TestClass test = new TestClass();
		System.out.println(test.s1 + " :: " + test.testNumber);
	}
}

class TestClass {
	String s1 = new String();
	int testNumber = 0;
	public TestClass() {
		this("", 2);
		s1.concat("default");
		testNumber = 1;		
	}

	public TestClass(String s, int num) {
		s1 = s;
		testNumber = num;
	}
}