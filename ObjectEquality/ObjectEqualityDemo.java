
public class ObjectEqualityDemo {
	public static void main(String[] args) {
		SimpleClass obj1 = new SimpleClass();
		obj1.field = 10;
		System.out.println(obj1.field + ":: " + obj1);

		SimpleClass obj2 = obj1;
		obj2.field = 100;
		System.out.println(obj2.field + ":: " + obj2);

		System.out.println("checking = = " + (obj1 == obj2));
		System.out.println("obj1.equals(obj2) :" + obj1.equals(obj2));
		System.out.println(obj1.field);

	}
}

class SimpleClass {
	public int field;
}