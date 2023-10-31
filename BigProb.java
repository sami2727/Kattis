import java.math.BigInteger;
import java.util.Scanner;

public class BigProb {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		

		while(in.hasNext()) {
			long a = in.nextLong();
			long b = in.nextLong();
			System.out.println(Math.abs(a - b));
		}
	

	}

}
