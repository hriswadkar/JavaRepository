import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) {
		try {
			//InetAddress addr = InetAddress.getByName("localhost:8083");
			//InetAddress addr = InetAddress.getLocalHost();
			Socket s = new Socket("localhost", 8083);
			InputStream in = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			s.close(); 
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}