import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "Junk.txt";
		File f = new File(s);
		
		if(f.exists()) {
			System.out.println("Overwrite " + s + " (y/n)?");
			
			if(br.readLine().toLowerCase().equals("y")) {
				return;
			}
		}
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(s)));
		
		System.out.println("Enter some text from keyboard");
		
		System.out.println("Press ^Z (Ctrl + Z) to terminate");
		
		String s2;
		
		while((s2 = br.readLine()) != null) {
			pw.println(s2);
		}
		
		pw.close();
	}
}