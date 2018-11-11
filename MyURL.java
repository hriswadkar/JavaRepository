import java.net.*;

public class MyURL {
	public static void main(String[] args) throws MalformedURLException {
		URL u = new URL("http://www.google.com/index.jsp");
		System.out.println("URL Protocol: " + u.getProtocol());
		System.out.println("Port: " + u.getPort());
		System.out.println("Host: " + u.getHost());
		System.out.println("URL File: " + u.getFile());
		System.out.println("URL Ref: " + u.getRef());
	}
}