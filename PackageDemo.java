import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class PackageDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter some text\n");
		String line = reader.readLine();
		System.out.println("You entered \n" + line);
		Scanner sc = new Scanner(System.in);
	}
}