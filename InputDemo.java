import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputDemo {
	public static void main(String[] args) throws IOException {
		int a;
		double b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: \n");
		a = sc.nextInt();
		System.out.println("Enter a double number: \n");
		b = sc.nextDouble();
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("sum is " + (a + b));
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter your age: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("\nyour age is: " + age);
		
		System.out.println("You entered " + args[0] + " from console");
	}
}