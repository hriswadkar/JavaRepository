import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Date;

public class FileDemo1 {
	public static void main(String[] args) {
		try {
			File file = new File("C:/temp/Test.txt");
			FileInputStream fileStream = new FileInputStream(file);
			
			byte[] bytes = new byte[1000];
			System.out.println(fileStream.read(bytes));
			ByteArrayInputStream byteInput = new ByteArrayInputStream(bytes);
			fileStream.close();
			byteInput.close();
			
			FileReader reader = new FileReader(file);
			char[] chars = new char[100];
			reader.read(chars);
			
			for(int i=0;i<chars.length;i++) {
				System.out.print(chars[i]);
			}
			
			reader.close();
			
			FileOutputStream fileOut = new FileOutputStream("C:/temp/Test.txt");
			String s = "This program is for testing Java IO";
			for(int i=0;i<s.length();++i) {
				fileOut.write(s.charAt(i));
			}
			
			fileOut.close();
			System.out.println();
			
			FileInputStream fileInput = new FileInputStream("C:/temp/Test.txt");
			int a = fileInput.available();
			System.out.println("Test.txt has " + a + " bytes available");
			
			byte[] b = new byte[a];
			
			int br = fileInput.read(b, 0, a);
			
			System.out.println(br + " bytes were read");
			System.out.println("Bytes read are: " + new String(b));
			
			fileInput.close();
			
			File f = new File("C:/temp/Test3.txt");
			f.delete();
			
			File file2 = new File("C:/temp/Test2.txt");
			FileWriter writer = new FileWriter(file2);
			writer.write("This is new file created in Java on " + new Date());
			writer.close();
			
			
			//file.close();			
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch(IOException ex) {
			ex.printStackTrace();
		}

	}
}