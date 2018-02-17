import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("What was your test score out of 100?");
		int grade = Integer.parseInt(a);
		if (grade >= 90) {
			JOptionPane.showMessageDialog(null, "Great you got an A!");
		} else if (grade >= 80) {
			JOptionPane.showMessageDialog(null, "You got a B, but try to study more.");
		} else if (grade >= 70) {
			JOptionPane.showMessageDialog(null, "You got a C,TRY HARDER");
		} else {
			JOptionPane.showMessageDialog(null, "Did you even try?");
		}
	}
}
