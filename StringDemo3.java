public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = " Welcome t1 to ";
		String s2 = "IGNOU Ghatkopar";
		String s5 = "welcome";
		String s4 = "welcome";
		String s3 = s1 + s2;
		System.out.println(s1 + s2);
		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.trim());
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('e', 3));
		System.out.println("last index of t is: " + s1.lastIndexOf('t'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.toCharArray());
		System.out.println(s5.equals(s4));
		System.out.println(s5.equalsIgnoreCase(s4));
		System.out.println(s1.charAt(4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s5.compareTo(s4));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 8));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('e','X'));
		System.out.println(s1.valueOf('e'));
		
		String age = new String("Your age is: ");
		String age2 = new String();
		int age1 = 30;
		age2 = String.valueOf(age1);
		System.out.println(age + age2);
	}
}