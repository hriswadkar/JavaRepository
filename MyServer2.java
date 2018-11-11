import java.io.*;
import java.net.*;

public class MyServer2 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6666);
			
				Socket s = ss.accept();
				DataInputStream ds = new DataInputStream(s.getInputStream());
				String str = (String)ds.readUTF();
				System.out.println("Message from client: " + str);
				
				ss.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}