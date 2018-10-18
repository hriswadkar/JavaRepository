import java.util.Scanner;

public class SwitchCaseType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str1 = sc.next();
		String str2 = new String(str1);
		
		switch(str1) {
			case "hello":
				System.out.println("You said hello");
				break;
			case "hi":
				System.out.println("You said hi");
				break;
			default:
				System.out.println("You said something else");
				break;
		}
		
		switch(str2) {
			case "hello":
				System.out.println("You said hello");
				break;
			case "hi":
				System.out.println("You said hi");
				break;
			default:
				System.out.println("You said something else");
				break;
		}		
	}
}