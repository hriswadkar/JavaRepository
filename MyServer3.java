import java.io.*;
import java.net.*;

public class MyServer3 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6667);
			
				Socket s = ss.accept();
				DataInputStream ds = new DataInputStream(s.getInputStream());
				DataOutputStream os = new DataOutputStream(s.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				String str = "";
				String str2 = "";
				while(!str.equals("stop")) {
					
					str = ds.readUTF();
					System.out.println("Client says: " + str);
					str2 = br.readLine();
					os.writeUTF(str2);
					os.flush();
				}
				//System.out.println("Message from client: " + str);
				ds.close();
				os.close();
				ss.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}