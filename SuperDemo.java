
class Parent {
	protected int id;
	
	public Parent(int id) {
		this.id = id;
	}
	
	public void parentMethod() {
		System.out.println("\nThis is parent method");
	}
}

class Child extends Parent {
	public Child(int id) {
		super(id);
	}
	
	public void childMethod() {
		super.parentMethod();
		System.out.println("\nThis is child method");
	}
}

class SuperDemo {
	public static void main(String[] args) {
		Child obj = new Child(10);
		obj.childMethod();
	}
}