public class RemoveMissingChar {
	public static void main(String[] args) {
		RemoveMissingChar removeMissingChar = new RemoveMissingChar();
		System.out.println("kitten");
		System.out.println(removeMissingChar.missingChar("kitten", 1));
	}

	public String missingChar(String str, int n) {
		char charValue = str.charAt(n);
		String newString = "";
		for (int i = 0;i<str.length();i++) {
			if(str.charAt(i) == charValue) {

			}
			else {
				newString += str.charAt(i);
			}
		}
		return newString;
	}
}