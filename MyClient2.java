import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient2 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);

			DataOutputStream os = new DataOutputStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter some text");
			String str = sc.nextLine();
			System.out.println(str);
			os.writeUTF("Hello Server: " + str);
			
			os.flush();
			os.close();
			
			s.close(); 
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}