public class LoopWithLabel2 {
	public static void main(String [] args) {
		int age = 10;
		outer:
			while(age <= 21) {
				age++;
				if(age == 16) {
					System.out.println("Get your driver's license");
					continue outer;
				} else {
					System.out.println("Another year");
				}

			}
	}
}