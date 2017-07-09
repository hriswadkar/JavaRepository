import java.util.Scanner;
public class FloydTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows which you want in your Floyd Triangle: ");
		int r = in.nextInt();
		System.out.println("r is %d" + r);
		int n=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(++n+" ");
			}
			System.out.println();
		}
	}
}