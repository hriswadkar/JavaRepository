final class NotInheritable {
	public void testMethod() {
		System.out.println("\nInside class NotInheritable");{
		}
	}
}

class Inheritable {
	public final void notOverridable() {
		System.out.println("\nThis method cannot be overridden by child class");
	}
}

class SampleChild extends NotInheritable {
	public void anotherMethod() {
		System.out.println("\nInside class SampleChild");
	}
}

class SampleChild2 extends Inheritable {
	@Override
	public void notOverridable() {
		System.out.println("\nMethod overridden in child class");
	}
}

class FinalDemo1 {
	public static void main(String[] args) {
		SampleChild obj = new SampleChild();
		obj.anotherMethod();
		
		SampleChild2 obj2 = new SampleChild2();
		obj2.notOverridable();
		
		final double PI = 3.14;
		
		System.out.println("\n Value of PI " + PI);
		
		PI = 33.66;
		
		System.out.println("\n Value of PI " + PI);
	}
}