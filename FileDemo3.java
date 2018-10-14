import java.io.*;

class FileDemo3 {
	static String readLine() {
		StringBuffer sb = new StringBuffer();
		try {
			BufferedInputStream bis = new BufferedInputStream(System.in);
			int in = 0;
			char inc;
			do {
				in = bis.read();
				inc = (char)in;
				if (in != -1) {
					sb.append(inc);
				}
			} while((in != 1) && (inc != '\n'));
			
			bis.close();
			return sb.toString();
		} catch(IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("What is your name: ");
		String input = FileDemo3.readLine();
		System.out.println("Hello " + input);
	}
}