import java.util.Scanner;

public class NinetyNineProblems {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int a = s.length();
		int b = Integer.parseInt(s);
		int c = s.charAt(0);
		int d = 0;

		if (s.length() <= 2) {
			d = 99;
		}
		else {
			String v = s.substring(0, s.length() - 2);
			String m = s.substring(s.length() -2, s.length());
			int n = Integer.parseInt(m);
			if (m.equals("00")) {
				d = b - 1;
			}
			else {
				if (n >= 49) {
					int i = 0;
					while (i < 2) {
						d = (d * 10) + 9;
						i++;
					}
					String f = Integer.toString(d);
					String g = s.replace(s, v + f);
					d = Integer.parseInt(g);
				}
				else {
					int i = 0;
					while (i < 2) {
						d = (d * 10) + 9;
						i++;
					}
					String f = Integer.toString(d);
					int j = Integer.parseInt(v) - 1;

					String g = s.replace(s, j + f);
					d = Integer.parseInt(g);
				}
			}


		}
		System.out.println(d);
		in.close();
	}


}
