
class Vegetable {
	public void message() {
		System.out.println("\nMain Vegetable");
	}
}

class Tomato extends Vegetable {
	public void message() {
		System.out.println("\nThis vegetable is Tomato");
	}
}

class PolymorphismDemo2 {
	public static void main(String[] args) {
		Vegetable obj = new Tomato();
		obj.message();
	}
}