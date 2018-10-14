import java.util.Scanner;

public class AsciiConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i] + ": ASCII value: = " + (int)ch[i]);
		}
		
		for(int i=0;i<=122;i++) {
			System.out.println(i + ": ASCII value: = " + (char)i);
		}
		
	}
}