import java.io.*;
import java.util.Scanner;

public class CharDemo1 {
	public static void main(String[] args) {
		char c = 'A';
		Character ch = new Character('A');
		
		//System.out.println(c.equals(ch));
		System.out.println(ch.equals(c));
		System.out.println(ch == c);
		System.out.println(c == ch);
		
		
	}
}