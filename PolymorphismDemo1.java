

class A {
	public void message(A a) {
		System.out.println("Object A");
	}
	
	public void parentMethod() {
		System.out.println("\nMethod in parent class");
	}
}

class B extends A {
	public void message(B b) {
		System.out.println("Object B");
	}
	
	@Override
	public void parentMethod() {
		System.out.println("\nMethod in parent class overridden in Child class");
	}
	
	public void overloadedMethod() {
		System.out.println("\nOverloaded method with no arguments");
	}
	
	public void overloadedMethod(int num) {
		System.out.println("\nOverloaded method with int argument. Value is " + num);
	}
	
}

class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		obj.message(obj);
		
		
		A obj1 = new A();
		obj1.parentMethod();
		
		B obj2 = new B();
		obj2.overloadedMethod();
		obj2.overloadedMethod(100);
		obj2.parentMethod();
		
	}
}