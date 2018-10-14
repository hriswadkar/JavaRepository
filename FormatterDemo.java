import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		
		formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
		
		System.out.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
	}	
}