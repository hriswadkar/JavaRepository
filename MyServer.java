import java.io.*;
import java.net.*;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(8083);
			while(true) {
				Socket cn = s.accept();
				InputStream is = cn.getInputStream();
				OutputStream os = cn.getOutputStream();
				
				cn.close();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}