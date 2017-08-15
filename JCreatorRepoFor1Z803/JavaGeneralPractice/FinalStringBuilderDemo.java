public class FinalStringBuilderDemo {
	public static void main(String[] args) {
		final StringBuilder testStringBuilder = new StringBuilder("I good!");
		testStringBuilder.insert(1, " am looking ").append("!!!");
		//testStringBuilder.remove(testStringBuilder.length() - 2);
		System.out.println(testStringBuilder.toString());
	}
}