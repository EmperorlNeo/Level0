import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int b = Integer.parseInt(age);
		if (b >= 18) {
			JOptionPane.showMessageDialog(null, "Who should the next president be?");
		} else {
			JOptionPane.showMessageDialog(null, "No one cares what you think.");
		}
	}
}
