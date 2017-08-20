public class MainMethodOverload1 {
	public static void main(String[] args) {
		main(Integer.parseInt(args[0]));
	}
	public static void main(int args) {
		System.out.println(args);
	}
}