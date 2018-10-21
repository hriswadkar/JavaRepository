import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) {
		File f1 = new File("TestFile.txt");
		System.out.println("File name: " + f1.getName());
		System.out.println("File Path: " + f1.getPath());
		System.out.println("File Absolute Path : " + f1.getAbsolutePath());
		System.out.println("File " + (f1.exists() ? "exists" : "does not exist"));
		System.out.println(f1.canWrite() ? " is writable" : "is not writable");
		System.out.println(f1.canRead() ? " is readable" : "is not readable");
		System.out.println("File size: " + f1.length() + " bytes");
		System.out.println("Creating object of TextFileInput");
		TextFileInput fileIput = new TextFileInput(args[0]);
	}
}

class TextFileInput {
	public TextFileInput(String filePath) {
		File file = new File(filePath);
		if (file == null || !file.exists()) {
			System.out.println("Error:");
		}
		
		int numberByteRead = 0;
		
		try {
			int temp = 0;
			FileReader fileReader = new FileReader(file);
			
			while(temp != -1) {
				temp = fileReader.read();
				if(temp != -1) {
					numberByteRead++;
				}
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Number of bytes read: " + numberByteRead);
		System.out.println("File length: " + file.length());
	}
}