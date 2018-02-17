import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("What is your height in inches?");
		int b = Integer.parseInt(a);
		if (b <= 48) {
			JOptionPane.showMessageDialog(null, "You need to grow first.");
		} else {
			JOptionPane.showMessageDialog(null, "You may go on the rollercoaster.");
		}
	}
}
