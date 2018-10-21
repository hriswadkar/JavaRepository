import java.io.StreamTokenizer;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;


public class StreamTokenizerDemo {
	public static void main(String[] args) {
		String example = "this 123 is an 3.14 !\\ \n simple test";
		
		try {
			InputStream input = new StringBufferInputStream(example);
			StreamTokenizer parser = new StreamTokenizer(input);
			
			while(parser.nextToken() != StreamTokenizer.TT_EOF) {
				if (parser.ttype == StreamTokenizer.TT_WORD) {
					System.out.println("a word: " + parser.sval);
				} else if(parser.ttype == StreamTokenizer.TT_NUMBER) {
					System.out.println("a number: " + parser.nval);	
				} else if(parser.ttype == StreamTokenizer.TT_EOL) {
					System.out.println("EOL");
				} else if(parser.ttype == StreamTokenizer.TT_EOF) {
					throw new IOException("End of file");
				} else {
					System.out.println("other " + (char)parser.ttype);
				}
			}
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}