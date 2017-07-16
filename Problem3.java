public class Problem3 {
	public static void main(String[] args) {
		long largestNum = 600851475143l;
		long largestPrimeFactorial = 1;
		System.out.println("Largest num is: " + largestNum);

		for(int i=2;i<largestNum;i++) {
			if(largestNum % i == 0) {
				boolean isPrime = true;
				for(long j=2;j<i;j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					largestPrimeFactorial = i;
				}
			}
		}

		System.out.println("Largest prime factorial is " + largestPrimeFactorial);
	}
}