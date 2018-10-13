import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		
		try {
			File inFile = new File("InputFile.txt");
			File outFile = new File("OutFile.txt");
			
			inStream = new FileInputStream(inFile);
			outStream = new FileOutputStream(outFile);
			
			byte[] buffer = new byte[1024];
			
			int length;
			
			while((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}
			
			inStream.close();
			outStream.close();
			
			System.out.println("File copied successfully");
			
		} catch(IOException ex) {
			ex.printStackTrace();
		} 
	}
}