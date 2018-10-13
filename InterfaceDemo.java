interface MyInterface2 {
	public void sayHello();
	public void welcomeUser();
}

public class InterfaceDemo implements MyInterface2 {
	public void sayHello() {
		System.out.println("interface method sayHello() implemented\n");
	}
	
	public void welcomeUser() {
		System.out.println("interface method welcomeUser() implemented\n");
	}
	
	public static void main(String[] args) {
		new InterfaceDemo().sayHello();
		new InterfaceDemo().welcomeUser();
	}
}