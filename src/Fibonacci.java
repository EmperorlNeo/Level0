
public class Fibonacci {
	public static void main(String[] args) {
		int x = 0;
		int r = 1;
		int i;
		int f;
		System.out.println();
		for (i = 0; i <= 144; i++) {
			f = i + r;
			x = f + r;
			i = x + f;
			System.out.println(f);
		}
	}

}
