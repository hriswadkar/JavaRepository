
public class EvenFibonacciSum {
	public static void main(String[] args) {
		int maxLimit = 4000000;
		//int maxLimit = 10;
		int firstSeqNum = 1;
		int nextSeqNum = 1;
		int total = 0;
		int evenSum = 0;

		System.out.print(firstSeqNum + " " + nextSeqNum + " ");
		while(total<maxLimit) {
			total = firstSeqNum + nextSeqNum;
			firstSeqNum = nextSeqNum;
			nextSeqNum = total;
			if(total % 2 == 0) {
				evenSum += total;
			}
		}
		System.out.println("Even EvenFibonacciSum is " + evenSum);
	}
}