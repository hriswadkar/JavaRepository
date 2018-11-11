import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient3 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6667);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream os = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = "";
			String str2 = "";
			
			while(!str.equals("stop")) {
				System.out.println("enter some text");
				str = br.readLine();
				os.writeUTF(str);
				str2 = dis.readUTF();
				System.out.println("Server says: " + str2);
			}
			
			os.close();
			s.close(); 
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}