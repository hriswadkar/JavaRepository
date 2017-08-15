package com.exception.handling.demo;

public class JVMError {

	public static void main(String[] args) {
		// Call method callMethod of CircularReference class
		JVMError jvmError = new JVMError();
		jvmError.callMethod();
	}
	
		public void callMethod() {
			// This method is calling itself so it will be
			// circular reference and JVM after some time
			// should throw StackOverFlowException
			callMethod();
	}

}
