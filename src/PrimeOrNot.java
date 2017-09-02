import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog(null, "Enter a number:");
		int ok = Integer.parseInt(prime);
		for (int i = 2; i < ok-1; i++) {
		if (ok % i == 0) {
			JOptionPane.showMessageDialog(null, "That is not a prime number.");
			System.exit(0);
		}
		}
		JOptionPane.showMessageDialog(null, "That is a prime number.");
	
	}
}
