public class VariableDeclarationDemo {
	int classLevelVariable;
	static int staticVar;
	public static void main(String[] args) {
		int a = 0, b = 0, c = 100;
		int x = 100, y =98, z = 99;
		classLevelVariable = 1000;
		staticVar = 500;

		System.out.println(a + " " + b + " " + c + " " + x + " " + y + " " + z + " " + classLevelVariable);
		//System.out.println(a + " " + b + " " + c + " " + x + " " + y + " " + z);

		VariableDeclarationDemo obj  = new VariableDeclarationDemo();
		obj.TestMethod();
	}

	public void TestMethod() {
		System.out.println("staticVar is: " + staticVar);
	}
}