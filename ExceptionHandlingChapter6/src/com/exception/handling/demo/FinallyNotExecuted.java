package com.exception.handling.demo;

import java.io.IOException;

public class FinallyNotExecuted {

	public static void main(String[] args) {
		try {
			throw new IOException();
		}
		catch(IOException ex) {
			System.out.println("This is inside catch block and the last statement");
			// below line will be executed and JVM will exit because of which 
			// finally block will not be executed.
			System.exit(0);
		}
		finally {
			System.out.println("This finally block will not be executed");
		}
	}

}
