import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileDemo2 {
	public static void main(String[] args) {
		try {
			
			FileReader reader = new FileReader("C:/temp/Test2.txt");
			PrintWriter pw = new PrintWriter(System.out, true);
			char[] c = new char[10];
			int read = 0;
			
			while((read = reader.read(c))!= -1) {
				pw.write(c, 0, read);
			}
			
			pw.close();
			reader.close();
			

			
			
			//file.close();			
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}

	}
}