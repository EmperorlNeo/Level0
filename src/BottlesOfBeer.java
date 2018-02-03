
public class BottlesOfBeer {
	public static void main(String[] args) {
		String a = " bottle";
		String b = " on the wall";
		String c = "Take one down and pass it around, ";
		String d = " of beer";
		String e = " more";
		String f = "no";
		String g = "s";
		String h = ", ";
		String j = ". ";
		for (int i = 99; i >= 3; i--) {
			System.out.println(i + a + g + d + b + h + i + a + g + d + j + c + (i - 1) + a + g + d + b + j);
		}
		System.out.println(2 + a + g + d + b + h + 2 + a + g + d + j + c + 1 + a + d + b);
		System.out.println(1 + a + d + b + h + 1 + a + d + j + c + f + e + a + g + d + b + j);
		System.out.println("No" + e + a + g + d + b + h + f + e + a + g + d + j + "Go to the store and buy some" + e + h
				+ 99 + a + g + d + b + j);
	}
}
